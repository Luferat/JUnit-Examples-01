package net.luferat.tests01;

public class NumberCalc {

	double num1, num2;

	public NumberCalc(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double numberPlus() {
		return num1 + num2;
	}
	
	public double numberMinus() {
		return num1 - num2;
	}
	
	public double numberMult() {
		return num1 * num2;
	}

}
