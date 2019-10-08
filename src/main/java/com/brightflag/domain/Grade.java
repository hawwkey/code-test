package com.brightflag.domain;

public class Grade {
	//TODO
	private Integer examID;
	private String examName;

	public Integer getExamID() {
		return examID;
	}

	public void setExamID(Integer examID) {
		this.examID = examID;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	@Override
	public String toString() {
		return "Grade [examID=" + examID + ", examName=" + examName + "]";
	}

}
