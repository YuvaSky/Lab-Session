/*
 Question : Wap to find reverse of a number
 Name : Sumit Yadav
 Date : 6/10/2022
 */
package Corejava;

import java.util.Scanner;

 class Reversenumber {
	public static void main(String[]args) {
	//creating scanner object to take input from user
	Scanner sc = new Scanner(System.in);
	// getting value from the user
	System.out.println("enter the number");
	int num1 = sc.nextInt();
	int reverse = 0;
	// writting operation
	while(num1 != 0)
	{
		reverse = reverse * 10;
		reverse = reverse + num1%10;
		num1 = num1/10;
	}
	// getting result
	System.out.println("Reverse  number is " + reverse);
	}
}
