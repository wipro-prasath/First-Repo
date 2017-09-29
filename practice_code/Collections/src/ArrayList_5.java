import java.util.ArrayList;

public class ArrayList_5 {

	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<String>();

		colours.add("Grey");
		colours.add("Blue");
		colours.add("Orange");
		colours.add("Red");
		colours.add("Yellow");
		colours.add("Black");

		
		colours.remove(2);
		System.out.println(colours);
	}
}
