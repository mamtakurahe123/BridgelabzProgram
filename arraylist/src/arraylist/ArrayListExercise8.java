
//Write a Java program to sort a given array list.

package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise8 {
	
	public static void main(String[] args) {
		
		List<String> listString = new ArrayList<String>();
		
		listString.add("Red");
		listString.add("Orange");
		listString.add("Yellow");
		listString.add("Green");
		listString.add("White");
		listString.add("Black");
		listString.add("Pink");
		
		System.out.println("Print List Array Element before Shorting \n" + listString);
		Collections.sort(listString);
		System.out.println("Print List Array Element after Shorting \n" + listString);
		
		
		List<String> listInteger = new ArrayList<String>();
		
		listInteger.add("2");
		listInteger.add("8");
		listInteger.add("3");
		listInteger.add("4");
		listInteger.add("1");
		listInteger.add("6");
		listInteger.add("7");
		
		System.out.println("Print List Array Element before Shorting \n" + listInteger);
		Collections.sort(listInteger);
		System.out.println("Print List Array Element after Shorting \n" + listInteger);
		
	}

}
