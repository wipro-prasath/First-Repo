package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set3 {

	public static void main(String[] args) {

		TreeSet<String> colours = new TreeSet<String>();
		TreeSet<String> treereverse = new TreeSet<String>();

		colours.add("Green");
		colours.add("Red");
		colours.add("Orange");
		colours.add("Grey");
		colours.add("Blue");

		// creating reverse set
		treereverse = (TreeSet) colours.descendingSet();

		// create descending set
		Iterator iterator;
		iterator = treereverse.iterator();

		// displaying the Tree set data
		System.out.println("Tree set data in reverse order: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}

}
