/*
 Question : WAP to sort int array in Ascending order.
 Name : Sumit Yadav
 Date : 27/10/2022
 */
package Corejava;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray {
	public static void main(String[]args) {
		//creating scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		// declaring the array size
		System.out.println("Enter the array size");
	    int  num = sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the element");
		for(int i=0;i<num; i++) {
			arr[i]=sc.nextInt();
		}
		//Sort the Array in Ascending Order
		Arrays.sort(arr);
		System.out.printf("Ascending order[] : %s" , 
				                Arrays.toString(arr));
		
	}

}
