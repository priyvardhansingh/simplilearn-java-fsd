package com.vardhan.arithmetic.calculator;

import java.util.Scanner;

public class MyArithmeticCalculator {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.println("Welcome to arithmetic Calculator");
		System.out.println("::::::::::::::::::::::::::::::::");
		System.out.println("Please enter two number below");
		System.out.println(":::::::::::::::::::::::::::::::");
		
		
		int num1 = a.nextInt();
		int num2 = b.nextInt();
		
		System.out.println("First Number" + num1);
		System.out.println("Second Number" + num2);
		
		MyArithmeticCalculator myCal = new MyArithmeticCalculator();
		
		int addOut = myCal.addition(num1, num2);
		int subOut = myCal.subtraction(num1, num2);
		double divOut = myCal.division(num1, num2);
		int mulOut = myCal.multiplication(num1, num2);
		
		System.out.println("Here is your result");
		System.out.println("Addition" + num1 + "+" + num2 + "=" + (addOut));
		System.out.println("Subtraction" + num1 + "-" + num2 + "=" + (subOut));
		System.out.println("Division" + num1 + "/" + num2 + "=" + (divOut));
		System.out.println("Multiplication" + num1 + "*" + num2 + "=" + (mulOut));
		
		
		
		
		
		
		
	}
	
	public int addition(int a , int b){
		return a + b;
	}
	
	public int multiplication (int a , int b){
		return a * b;
	}
	
	public int subtraction (int a , int b){
		return a - b;	
	}
	
	public double division (double a , double b){
		return a / b;	
	}
 
}
