/*
 Write a java program to replace the second element of a ArrayList with the specified element
 Name : Sumit Yadav
 Date : 3/11/2022
 */
package Corejava;

import java.util.*;

public class ReplaceArrayelement {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();//Creating arrayList
		//adding object in arraylist
		num.add(1);
		num.add(2);
		num.add(3);
		Iterator a=num.iterator();
		Collections.replaceAll(num,2,3);//replacing element
		System.out.println("Array replace"+ num);

	}

}
