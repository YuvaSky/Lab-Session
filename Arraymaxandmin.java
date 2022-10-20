/*
 Question : Write a Java program to find the maximum and minimum value of an array
 Name : Sumit Yadav
 Date : 20-10-2022
 */
package Corejava;

import java.util.Scanner;

public class Arraymaxandmin {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int a = sc.nextInt();
		// declaring the array
		int i,arr[] = new int[a];
		// traversing the array
			System.out.println("enter the element");
			for(i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0],min=arr[0];
		// initialiazing the process
		for( i=0; i<a; i++) {
		if(arr[i]>max)
		  max= arr[i];
		if(arr[i]<min)
		  min=arr[i];
		}
		// getting the result
		System.out.println("Maximum number is "+max);
		System.out.println("Minimum number is "+min);
		
		
	}

}
