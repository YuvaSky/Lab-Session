package Corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Findsecondlargestarray {
 public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of arrray");
	 int num = sc.nextInt();
	// declaring the array
	 int n[] = new int[num];
	// traversing the array
	 System.out.println("enter the element");
		for(int i=0; i<num; i++) {
	// initialiazing the process
	 for( i=0;i<num;i++)
		 n[i]=sc.nextInt();
	 
	 Arrays.sort(n);
	// getting the result
	 System.out.print("The second largest number is" +n[num-2]);
		}
	 }
 }
 

