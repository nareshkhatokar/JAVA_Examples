package com.java.reportCard;

public class reportCardSwitchCase {
	
	public String grade = null;
	public int gradeLevel;
	public void calculateGrade(int marks) {
		if (marks < 35){
			gradeLevel = 0;
		}
		else if (marks < 50) {
			gradeLevel = 1;
		}
		else if (marks < 60) {
			gradeLevel = 2;
		}
		else if (marks < 70) {
			gradeLevel = 3;
		}
		else {
			gradeLevel = 4;
		}
		switch (gradeLevel) {
		case 0:
			grade = "Fail";
			break;
		case 1:
			grade = "Third Class";
			break;
		case 2:
			grade = "Second Class";
			break;
		case 3:
			grade = "First Class";
			break;
		case 4:
			grade = "Distinction";
			break;
		default:
			grade = "Fail";
			break;
		}
		System.out.println("Grade of Student for " + marks + " marks is " + grade);
	}

}
