package Corejava;

import java.util.Iterator;
import java.util.LinkedList;

 class checkedelement {

	public static void main(String[] args) {
		LinkedList<Integer> num =new LinkedList<Integer>();//Creating Linkedlist
		//adding object in Linkedlist
		num.add(4);
		num.add(2);
		num.add(5);
		num.add(4);
		//System.out.println(ob);
		//Iterator a=ob.iterator();
		if(num.contains(4)) {
			System.out.println("num 4 is existed");
		}else {
			System.out.println("num 4 is not existed");
			
		}
		if(num.contains(8)) {
			System.out.println("num 8 is existed ");
		}else {
			System.out.println("num 8 is not existed");
			
		}
	}
}