package com.java.reportCard;

public class ReportCard {
	public String grade = null;
	public void showGrade(int marks){
		
		if (marks >= 35){
			grade = "Pass";
		}
		else {
			grade = "Fail";
		}
		System.out.println("Grade of Student is " + grade + " for " + marks + " marks");
	}
}
