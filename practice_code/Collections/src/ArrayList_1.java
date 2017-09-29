
import java.util.*;

public class ArrayList_1 {

	
	
	
	public static void main(String[] args) {
		
		  ArrayList<String> colours = new ArrayList<String>();
		// TODO Auto-generated method stub
		colours.add("Green");
		colours.add("Blue");
		colours.add("Orange");
		colours.add("Black");
		
		
		// alternative way to print the list is
		//SSystem.out.println(colours);
		
		
		for(int i=0;i<colours.size();i++){
			System.out.println("Colours present in the list are: " + colours.get(i));
		}
		
		
	}

}
