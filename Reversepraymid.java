/*
 Ques :  to create ReversePyramid
 Name : Sumit Yadav
 Date : 6/10/2022
 */
package Corejava;
import java.util.Scanner;
 class Reversepraymid {
	public static void main(String[]args) {
		//creating scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		//getting input value form user
		System.out.println("enter the number:");
		int num = sc.nextInt();
		//Implementing the logic
		for(int i = 0; i<num; i++) {
		// Printing the spaces
		for(int j=0; j < i; j++){
			System.out.print("");
		}
		//Printing the stars
		for(int k = num-i; k>0; k--){
		System.out.print("*");
		}
		System.out.println("");
		}
	}
 }
