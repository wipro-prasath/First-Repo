
import java.util.*;

public class ArrayList_4 {

	public static void main(String[] args) {

		
		ArrayList<String> colours = new ArrayList<String>();
		
		colours.add("Grey");
		colours.add("Blue");
		colours.add("Orange");
		colours.add("Red");
		colours.add("Yellow");
		colours.add("Black");

		System.out.println(colours);
		
		
		
		
		// this replaces the third element and changes Red to Silver 
		colours.set(3, "Silver");
		
		System.out.println(colours);		
	}

}
