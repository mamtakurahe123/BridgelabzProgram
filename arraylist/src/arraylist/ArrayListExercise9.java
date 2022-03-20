
//Write a Java program to copy one array list into another

package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise9 {
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		list1.add("F");
		list1.add("G");
		list1.add("H");
		list1.add("I");
		list1.add("J");
		
		System.out.println("Element of List1 "+ list1);
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		list2.add("6");
		list2.add("7");
		list2.add("8");
		list2.add("9");
		list2.add("10");
		
		System.out.println("Element of List1 "+ list2);
		
		Collections.copy(list1, list2);
		
		System.out.println("Copy List to List2,\nAfter copy:");
		System.out.println("List1: " + list1);
		System.out.println("List2: " + list2);
		
		
	}

}
