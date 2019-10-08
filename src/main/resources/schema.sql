create table student (
   studentID integer auto_increment not null,
   firstName varchar(255) not null,
   lastName varchar(255) not null,
   primary key(studentID)
);

create table subject (
   subjectID integer auto_increment not null,
   subjectName varchar(255) not null,
   primary key(subjectID)
);

create table faculty (
   facultyID integer auto_increment not null,
   facultyName varchar(255) not null,
   primary key(facultyID)
);

create table studenttakessubject (
    studentID integer not null,
    subjectID integer not null,
    primary key (studentID, subjectID),
    foreign key (studentID) references student(studentID),
    foreign key (subjectID) references subject(subjectID)
);