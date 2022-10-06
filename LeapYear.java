/*
 Ques : to check for leap Year.Take the input from the user
 Name : Sumit Yadav
 Date : 6/10/2022
 */
package Corejava;

import java.util.Scanner;

class LeapYear {
	 public static void main(String[]args) {
		//creating scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		// getting value from the user
		System.out.println("Enter an year ::");
		int year =sc.nextInt();
        //writting operation
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			// getting result
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}
}

