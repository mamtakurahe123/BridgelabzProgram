package arraylist;

import java.util.ArrayList;

public class ArrayListExercise13 {
	
	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Red");
		l1.add("Green");
		l1.add("Black");
		l1.add("White");
		l1.add("Pink");
		
		ArrayList<String> l2 = new ArrayList<String>();
		
		l2.add("Red");
		l2.add("Green");
		l2.add("Black");
		l2.add("White");
		
		//Storing the comparison output in ArrayList<String>
        ArrayList<String> l3 = new ArrayList<String>();
        for (String e : l1)
           l3.add(l2.contains(e) ? "Yes" : "No");
        System.out.println(l3);
		
	}

}
