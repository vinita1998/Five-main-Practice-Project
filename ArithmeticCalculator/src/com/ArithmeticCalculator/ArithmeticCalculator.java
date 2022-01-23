package com.ArithmeticCalculator;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String args[])
	  {
	    int first, second, addition, substraction, multiplication;
	    float division;
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter Two Numbers : ");
	    first = scanner.nextInt();
	    second = scanner.nextInt();

	    addition = first + second;
	    substraction = first - second;
	    multiplication = first * second;
	    division = (float) first / second;

	    System.out.println("Sum = " + addition);
	    System.out.println("Difference = " + substraction);
	    System.out.println("Multiplication = " + multiplication);
	    System.out.println("Division = " + division);
	  }
}
