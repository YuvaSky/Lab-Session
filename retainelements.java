/*
 Write a java program to compare two sets and retain elements which are same on both side.(Using retainAll method)
 Name : Sumit Yadav
 Date : 03/11/2022
 */
package Corejava;

import java.util.HashSet;
import java.util.Iterator;

public class retainelements {

	public static void main(String[] args) {
		
     HashSet<Integer> ob = new HashSet<>();// Creating hashset
   //adding object in hashset
     ob.add(1);
     ob.add(2);
     ob.add(3);
     ob.add(4);
     ob.add(5);
     System.out.println(ob);
     HashSet<Integer> sc = new HashSet<>();
     sc.add(6);
     sc.add(2);
     sc.add(5);
     sc.add(1);
     sc.add(8);
     System.out.println(sc);
     ob.retainAll(sc);//Compare two set with retain method
     System.out.println("compare element");//printing result
     System.out.println(ob);
	}

}
