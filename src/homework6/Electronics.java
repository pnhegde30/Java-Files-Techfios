package homework6;

import java.util.*;

public class Electronics {
	
	Electronics(){
		System.out.println();
	}
	
	void electronics_method(){ 
		Scanner ui = new Scanner(System.in);
		System.out.println("Please enter an object name: ");
		String obj = ui.nextLine(); 
		if(obj.equalsIgnoreCase("Computer")) {
			System.out.println("Your object is an electronic");
		}
		else if(obj.equalsIgnoreCase("Tablet")) {
			System.out.println("Your object is an electronic");
		}
		else if(obj.equalsIgnoreCase("Phone")) {
			System.out.println("Your object is an electronic");
		}
		else if(obj.equalsIgnoreCase("Television")) {
			System.out.println("Your object is an electronic");
		}
		else if(obj.equalsIgnoreCase("TV")) {
			System.out.println("Your object is an electronic");
		}
		else if(obj.equalsIgnoreCase("PC")) {
			System.out.println("Your object is an electronic");
		}
		else if(obj.equalsIgnoreCase("Laptop")) {
			System.out.println("Your object is an electronic");
		}
		else if(obj.equalsIgnoreCase("E-reader")) {
			System.out.println("Your object is an electronic");
		}
		else {
			System.out.println("The object is either too niche or is not an electronic");
		}
	}

	public static void main(String[] args) {
		Electronics thing = new Electronics();
		Electronic_Type code = new Electronic_Type(); 
		
		thing.electronics_method(); 
		code.electronic_type_method();
	}
	


}
