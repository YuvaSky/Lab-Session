/*
 Ques :  to check the condition for checking the correct password using if-Else.take input from the user
 Name : Simit Yadav
 Date : 6/10/2022
 */
package Corejava;
import java.util.Scanner;
 class checkingpassword {
 public static void main(String[]args) {
	//creating scanner object to take input from user
	Scanner sc = new Scanner(System.in); 
	boolean valid = false;
	String password;
	// Asks user to enter password
	System.out.println("enter the password : ");
	password = sc.nextLine();
	// check the password at least 8 character
	if(password.length()<8) {
		valid = false;
		System.out.println("password must least 8 character");
	}
	//check the password acceptables
	for(int i = 0; i < password.length(); i++) {
		char c = password.charAt(i);
		
		if (   ('a' <= c && c <= 'z')
		     ||('A' <= c  && c <= 'Z')
		     || ('0' <= c && c <= '9')
			)
		{
			valid = true;
		}
		else {
			// if the password incorrect
			System.out.println("password incorrect");
			valid = false;
			break;
		}
	

	}while(!valid);
	// if the password is correct
   System.out.println("Password Accepted");
 }
}