package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set1 {

	public static void main(String[] args) {

		TreeSet<String> colours = new TreeSet<String>();

		colours.add("Green");
		colours.add("Red");
		colours.add("Orange");
		colours.add("Grey");
		colours.add("Blue");

		System.out.println(colours.toString());
		// another way of printing the values would be
		// System.out.println(colours);

		// create an iterator using iterator object
		Iterator iterator;
		iterator = colours.iterator();

		// displaying the Tree set data on the same line
		/*
		 * System.out.print("Tree set elements: "); while (iterator.hasNext()) {
		 * System.out.print(iterator.next() + " ");
		 * 
		 * }
		 */

		// another way of iterating through the elements
		Iterator<String> itr = colours.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}