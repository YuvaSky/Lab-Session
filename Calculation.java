package Corejava;

import java.util.Scanner;

public class Calculation {
	public static void main(String[]args) {
		char operator;
		double num1, num2, result;
		// Create an object of scanner class
		Scanner input = new Scanner(System.in);
		//getting the input value from user
		System.out.println("enter first number");
		num1 = input.nextDouble();		
		System.out.println("enter Second number");
		num2  = input.nextDouble();
		// ask to user to enter 1 to 4 number
		System.out.println("enter a number : press 1 for +, press 2 for -,press 3 for multipilication,press 4 for Division");
		operator = input.next().charAt(0);
		
		switch(operator) {
		// perform addition between number
		case'1':
		result	 = num1+num2;
			 System.out.println(num1 + "+" + num2 + "=" + result);
			 break;
			 //perform subtraction between number
		case'2':
		result	 = num1-num2;
			 System.out.println(num1 + "-" + num2 + "=" + result);
			 break;
			 // perform multiplication between number
		case'3':
		result	 = num1*num2;
			 System.out.println(num1 + "*" + num2 + "=" + result);
			 break;
			// perform Division between number
		case'4':
		result	 = num1/num2;
			 System.out.println(num1 + "/" + num2 + "=" + result);
			 break;
		 default:
			 System.out.println("Invalid operator");
			 break;
		}
		input.close();
	}
}


