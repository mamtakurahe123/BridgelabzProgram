package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {
	
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
		 Collections.reverse(liststrings);
		 System.out.println("List after reversing :\n" + liststrings); 
		 
		 
	}

}
