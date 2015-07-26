package com.java.reportCard;

public class GradeTester {

	public static void main(String[] args) {
		ReportCard rptCard = new ReportCard();
		rptCard.showGrade(35);
		rptCard.showGrade(0);
		rptCard.showGrade(60);
		rptCard.showGrade(36);
		rptCard.showGrade(34);
		
		reportCardSwitchCase rptSwitchCard = new reportCardSwitchCase();
		rptSwitchCard.calculateGrade(0);
		rptSwitchCard.calculateGrade(34);
		rptSwitchCard.calculateGrade(35);
		rptSwitchCard.calculateGrade(36);
		rptSwitchCard.calculateGrade(49);
		rptSwitchCard.calculateGrade(50);
		rptSwitchCard.calculateGrade(51);
		rptSwitchCard.calculateGrade(59);
		rptSwitchCard.calculateGrade(60);
		rptSwitchCard.calculateGrade(61);
		rptSwitchCard.calculateGrade(69);
		rptSwitchCard.calculateGrade(70);
		rptSwitchCard.calculateGrade(71);
		rptSwitchCard.calculateGrade(100);		
	}

}
