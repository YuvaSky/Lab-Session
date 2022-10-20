package Corejava;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringarray {

	public static void main(String[] args) {
		int n;
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		 n = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the string");
		String names[] = new String[n];
		for(int i = 0; i < n; i++) {
			names[i] = sc1.nextLine();
		}
		for(int i = 0; i<n;i++) {
		for(int j = i +1;j<n;j++) {
	
	   if (names[i].compareTo(names[j])>0);{
		   temp = names[i];
		   names[j] = names[j];
		   names[j] = temp;
	   }
		}
		}
	   
	    System.out.println("names");
	    for(int i = 0; i < n - 1; i++) {
	    System.out.print(names[i]+",");
	    }
	    System.out.print(names[n -1]);
	    }
}
