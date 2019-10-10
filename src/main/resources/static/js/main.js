var app = angular.module('bfCodeTest', ['ngRoute']);

app.controller('studentCtrl', function ($scope, $location, $http) {
    console.log("StudentCtrl loaded.");

    $http.get('http://localhost:8080/api/getStudents')
        .then(function (response) {
            $scope.students = response.data;
        });

});

app.controller('subjectCtrl', function ($scope, $location, $http) {
    console.log('SubjectCtrl loaded');

    $http.get('http://localhost:8080/api/getSubjects')
        .then(function (response) {
            $scope.subjects = response.data;
        })
});

app.controller('studentandsubjectCtrl', function ($scope, $location, $http) {
	console.log('StudentandSubjectCtrl loaded');

	$http.get('http://localhost:8080/api/getStudentsAndSubjects')
		.then(function (response) {
			$scope.subjects = response.data;
		})
});

app.controller('gradeCtrl', function ($scope, $location, $http) {
	console.log('GradesCtrl loaded');

	$http.get('http://localhost:8080/api/getGrades')
		.then(function (response) {
			$scope.subjects = response.data;
		})
});

app.config(function ($routeProvider) {
    $routeProvider
        .when("/", {template: "<p>Welcome, please choose tables from the top</p>"})
		.when("/students", {template: "<div ng-controller=\"studentCtrl\" class=\"container\">\n" +
				"    <table class=\"table\">\n" +
				"        <tr>\n" +
				"            <th>Student ID</th>\n" +
				"            <th>First Name</th>\n" +
				"            <th>Second Name</th>\n" +
				"        </tr>\n" +
				"        <tr ng-repeat=\"subject in subjects\">\n" +
				"            <td>{{student.studentID}}</td>\n" +
				"            <td>{{student.firstName}}</td>\n" +
				"            <td>{{student.secondName}}</td>\n" +
				"        </tr>\n" +
				"    </table>\n" +
				"</div>"})
		.when("/subjects", {
            template: "<div ng-controller=\"subjectCtrl\" class=\"container\">\n" +
                "    <table class=\"table\">\n" +
                "        <tr>\n" +
                "            <th>Subject ID</th>\n" +
                "            <th>Name</th>\n" +
                "        </tr>\n" +
                "        <tr ng-repeat=\"subject in subjects\">\n" +
                "            <td>{{subject.subjectID}}</td>\n" +
                "            <td>{{subject.name}}</td>\n" +
                "        </tr>\n" +
                "    </table>\n" +
                "</div>"
        })
        .when("/grades", {template: "<div ng-controller=\"gradeCtrl\" class=\"container\">\n" +
				"    <table class=\"table\">\n" +
				"        <tr>\n" +
				"            <th>Grade ID</th>\n" +
				"            <th>Result</th>\n" +
				"        </tr>\n" +
				"        <tr ng-repeat=\"grade in grades\">\n" +
				"            <td>{{grade.gradeID}}</td>\n" +
				"            <td>{{grade.result}}</td>\n" +
				"        </tr>\n" +
				"    </table>\n" +
				"</div>"})
		.when("/enrollment", {template: "<div ng-controller=\"studentandsubjectCtrl\" class=\"container\">\n" +
				"    <table class=\"table\">\n" +
				"        <tr>\n" +
				"            <th>Record ID</th>\n" +
				"            <th>Student ID</th>\n" +
				"            <th>Subject ID</th>\n" +
				"            <th>Grade ID</th>\n" +
				"        </tr>\n" +
				"        <tr ng-repeat=\"studenttakessubject in studenttakessubjects\">\n" +
				"            <td>{{studenttakessubject.recordID}}</td>\n" +
				"            <td>{{studenttakessubject.studentID}}</td>\n" +
				"            <td>{{studenttakessubject.subjectID}}</td>\n" +
				"            <td>{{studenttakessubject.gradeID}}</td>\n" +
				"        </tr>\n" +
				"    </table>\n" +
				"</div>"})
});