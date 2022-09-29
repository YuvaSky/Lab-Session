/* Create a program to find largest of two number
Name : Sumit Yadav
Date : 29/9/2022
*/
package Corejava;

import java.util.Scanner;

 class findlargestnumber {
	public static void main(String[]args){
		//creating scanner object to take input from user
	Scanner sc = new Scanner(System.in);
	//getting the value form the user
	System.out.println("enter first value");
	int  num1 = sc.nextInt();
	System.out.println("enter second value");
	int num2 = sc.nextInt();
	// writting operation
	 int  largest;
	 if(num1>num2)
	largest = num1;
	else
	 largest = num2;
	 System.out.println("\nlargest = " +largest);
		 }
	}
