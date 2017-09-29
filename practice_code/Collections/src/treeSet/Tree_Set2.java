package treeSet;


import java.util.Iterator;
import java.util.TreeSet;


public class Tree_Set2 {

	public static void main(String[] args) {
		
		
		TreeSet<String> colours = new TreeSet<String>();

		colours.add("Green");
		colours.add("Red");
		colours.add("Orange");
		colours.add("Grey");
		colours.add("Blue");

		Iterator iterator;
		iterator = colours.iterator();
		
		System.out.print("Iterating through all elements in the tree set: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");

		} 
	}

}
