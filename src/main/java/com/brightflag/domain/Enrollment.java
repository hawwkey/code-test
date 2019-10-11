package com.brightflag.domain;

public class Enrollment {
    private int recordID, studentID, subjectID, gradeID;

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public int getRecordID() {
        return recordID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setGradeID(int gradeID) {
        this.gradeID = gradeID;
    }

    public int getGradeID() {
        return gradeID;
    }

    @Override
    public String toString() {
        return "Enrollment [enrollmentID=" + recordID + ", studentID=" + studentID + ", subjectID=" + subjectID + ", gradeID=" + gradeID + "]";
    }

}
