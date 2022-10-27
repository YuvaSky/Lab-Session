/*
 Question : WAP to sort string Array in Descending order.
 Name : Sumit Yadav
 Date : 27/10/2022
 */
package Corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		//creating scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String arr=sc.nextLine();
		char a[]=arr.toCharArray();
		System.out.println("reverse of a string is");
		int i=a.length;
		for(int j=i;j>0;j--){
			System.out.print(a[j-1]);
		}
		
	}


	}

