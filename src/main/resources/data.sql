INSERT INTO student (firstName, lastName) VALUES('Mary', 'Smith');
INSERT INTO student (firstName, lastName) VALUES('Jose', 'Rodriguez');

INSERT INTO subject (subjectName) VALUES('Classics');
INSERT INTO subject (subjectName) VALUES('Math');
INSERT INTO subject (subjectName) VALUES('English');
INSERT INTO subject (subjectName) VALUES('Spanish');
INSERT INTO subject (subjectName) VALUES('Databases');

INSERT INTO grade (result) VALUES('A');
INSERT INTO grade (result) VALUES('B');
INSERT INTO grade (result) VALUES('C');
INSERT INTO grade (result) VALUES('D');
INSERT INTO grade (result) VALUES('E');
INSERT INTO grade (result) VALUES('F');

INSERT INTO enrollment (studentID, subjectID) VALUES (1, 2);
INSERT INTO enrollment (studentID, subjectID, gradeID) VALUES (1, 5, 2);
INSERT INTO enrollment (studentID, subjectID) VALUES (2, 1);
INSERT INTO enrollment (studentID, subjectID) VALUES (2, 3);
INSERT INTO enrollment (studentID, subjectID, gradeID) VALUES (2, 4, 1);
