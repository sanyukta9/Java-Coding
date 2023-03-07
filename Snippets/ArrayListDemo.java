
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		//Arraylist of strings , so we can add only String Element
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Sanyukta");
		obj.add("Adhate");
		//displaying elements of the arraylist
		for(String str:obj)
		System.out.println(str);
		
		//Add Elements at a given index
		obj.add(0, "Ryan");
		obj.add(1,"Paul");
		
		//displaying elements of the arraylist after add operation at index
		for(String str:obj)
		System.out.println(str);
				
				
		obj.remove("Adhate");
		
		//displaying elements of the arraylist after add operation at index
		for(String str:obj)
		System.out.println(str);
		
		obj.remove(1);//removes second element from the arraylist
		
		//displaying array list after remove elements of the arraylist at index
		for(String str:obj)
		System.out.println(str);
	
		//Sorting of Elements
		Collections.sort(obj);
		
		//display arraylist after sorting
		for(String str:obj)
		System.out.println(str);	
	
	}
}
