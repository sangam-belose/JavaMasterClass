package com.practice.basic;

public class EnumSwitchCase {
	public static void main(String[] args) {
		MonthsWithQuarter month = MonthsWithQuarter.JAN;
		System.out.println(month + " belongs to Quarter " + month.getQuarter());
		month = MonthsWithQuarter.APR;
		System.out.println(month + " belongs to Quarter " + month.getQuarter());

		month = MonthsWithQuarter.JUL;
		System.out.println(month + " belongs to Quarter " + month.getQuarter());

		month = MonthsWithQuarter.OCT;
		System.out.println(month + " belongs to Quarter " + month.getQuarter());
	}
}

enum MonthsWithQuarter {
	JAN(1), FEB(1), MAR(1),
	APR(2), MAY(2), JUN(2),
	JUL(3), AUG(3), SEPT(3),
	OCT(4), NOV(4), DEC(4);
	private final int quarter;

	MonthsWithQuarter(int quarter){
		this.quarter = quarter;
	}

	public int getQuarter() {
		return quarter;
	}
}