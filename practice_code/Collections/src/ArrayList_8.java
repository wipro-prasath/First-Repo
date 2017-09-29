import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_8 {

	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<String>();

		colours.add("Grey");
		colours.add("Blue");
		colours.add("Orange");
		colours.add("Red");
		colours.add("Yellow");
		colours.add("Black");
		colours.add("Green"); 

		System.out.println("The content of the colours arrayList is: " + colours);
		
		
		ArrayList<String> colours2 = new ArrayList<String>();
		
		colours2.add("Grey");
		colours2.add("Blue");
		colours2.add("Orange");
		colours2.add("Red");
		colours2.add("Yellow");
		colours2.add("Black");
		colours2.add("Gold"); 
		
		Collections.copy(colours2, colours);
		
		
		System.out.println("Copying the contents from the colours arraylist to colours2 arraylist");
		System.out.println("The content of the colours2 arrayList is: " + colours2);
		
	}
}
