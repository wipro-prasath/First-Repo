import java.util.ArrayList;


public class ArrayList_6 {

	public static void main(String[] args) {
	
		ArrayList<String> colours = new ArrayList<String>();

		colours.add("Grey");
		colours.add("Blue");
		colours.add("Orange");
		colours.add("Red");
		colours.add("Yellow");
		colours.add("Black");
		
		if(colours.contains("Red")){
			System.out.println("The colour Red was found in the array list");
		}
		else{
			System.out.println("Your value is not present in the array list");
		}

	}

}
