import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {

		ArrayList<String> colours = new ArrayList<String>();
		// TODO Auto-generated method stub
		colours.add("Green");
		colours.add("Blue");
		colours.add("Orange");
		colours.add("Black");

		/*
		 * for(int i=0;i<colours.size();i++){
		 * System.out.println("Colours present in the list are: " +
		 * colours.get(i)); }
		 */

		System.out.println("First value in the list is: " + colours.get(0));
		System.out.println("Third element in the list is " + colours.get(2));

	}

}
