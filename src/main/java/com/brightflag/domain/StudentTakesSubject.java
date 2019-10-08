package com.brightflag.domain;

public class StudentTakesSubject {
    private String studentID, subjectID;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    @Override
    public String toString(){
        return "Student "+studentID+" takes subject "+subjectID;
    }

}
