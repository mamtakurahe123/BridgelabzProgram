package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListExercise10 {
	
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		
		strings.add("Red");
		strings.add("Green");
		strings.add("Black");
		strings.add("White");
		strings.add("Orange");
		strings.add("Pink");
		strings.add("Purpal");
		strings.add("Yellow");
		strings.add("Blue");
		
		System.out.println("Print List Array Element before shuffling \n" + strings);
		Collections.shuffle(strings);
		System.out.println("Print List Array Element after shuffling \n" + strings);
		
	}

}
