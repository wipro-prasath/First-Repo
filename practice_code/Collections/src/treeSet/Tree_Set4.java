package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set4 {

	public static void main(String[] args) {
	
		TreeSet<String> colours = new TreeSet<String>();

		colours.add("Green");
		colours.add("Red");
		colours.add("Orange");
		colours.add("Grey");
		colours.add("Blue");

		 System.out.println("First element: "+colours.first());   
		 System.out.println("Last element: "+colours.last());   
		
		
	}

}
