import java.util.ArrayList;
import java.util.Collections;


public class ArrrayList_9 {

	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<String>();

		colours.add("Grey");
		colours.add("Blue");
		colours.add("Orange");
		colours.add("Red");
		colours.add("Yellow");
		colours.add("Black");
		colours.add("Green"); 
		
		Collections.reverse(colours);
		System.out.println(colours);

	}

}
