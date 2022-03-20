package arraylist;

import java.util.ArrayList;

import java.util.List;

public class ArrayListExercise12 {
	
	public static void main(String[] args) {
		
		 List<String> liststrings = new ArrayList<String>();
		 
		 liststrings.add("Black");
		 liststrings.add("Green");
		 liststrings.add("Blue");
		 liststrings.add("Orange");
		 liststrings.add("Red");
		 liststrings.add("Purple");
		 liststrings.add("Yellow");
		 
		 System.out.println("List before reversing :\n" + liststrings);  
		 List<String> sub_List = liststrings.subList(0, 5);
		 System.out.println("List of first three elements: " + sub_List);
		 
		 
	}

}
