/*
 Question : Write a java program to calculate the average value of array element
 Name : Sumit Yadav
 Date : 20/10/2022
 */
package Corejava;

import java.util.Scanner;

public class averagevalueofarray {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int a = sc.nextInt();
		// declaring the array
		int arr[] = new int[a];
		int sum = 0;
		System.out.println("enter the element");
		// traversing the array and sum the array
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		float average;
		// traversing the array to find the average
		System.out.println("Sum:"+sum);
		      average = (float)sum/a;
					System.out.println("Average:"+average);
				}
	             }
				

