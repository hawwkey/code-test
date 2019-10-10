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

create table grade (
    gradeID integer auto_increment not null,
    result enum ('A', 'B', 'C', 'D', 'E', 'F'),
    primary key (gradeID)
);

create table enrollment (
    recordID integer auto_increment not null,
    studentID integer not null,
    subjectID integer not null,
    gradeID integer,
    primary key (recordID),
    foreign key (studentID) references student(studentID)
    on delete cascade
    on update cascade ,
    foreign key (subjectID) references subject(subjectID)
    on delete cascade
    on update cascade,
    foreign key (gradeID) references grade(gradeID)
    on delete cascade
    on update cascade
);



