package homework6;

import java.util.*;

public class Electronic_Type {
	
	private static final String Phone = null;

	Electronic_Type(){
		System.out.println(); 
		}
	
	void electronic_type_method() { 
		System.out.println("Electronic Object Name: ");
		String obj = new String(); 
		Scanner ui = new Scanner(System.in);
		obj = ui.next();
		
		if(obj.equalsIgnoreCase("iPhone")) {
			System.out.println("Object is a phone");
		}
		else if(obj.equalsIgnoreCase("Samsung")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else if(obj.equalsIgnoreCase("Android")) {
			System.out.println("Object is a phone");
		}
		else if(obj.equalsIgnoreCase("Windows")) {
			System.out.println("Object is a Microsoft Product");
		}
		else if(obj.equalsIgnoreCase("Microsoft")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else if(obj.equalsIgnoreCase("LG")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else if(obj.equalsIgnoreCase("Apple")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else if(obj.equalsIgnoreCase("Dell")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else if(obj.equalsIgnoreCase("HP")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else if(obj.equalsIgnoreCase("Lenovo")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else if(obj.equalsIgnoreCase("Acer")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else if(obj.equalsIgnoreCase("Asus")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else if(obj.equalsIgnoreCase("Huawei")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else if(obj.equalsIgnoreCase("Google")) {
			System.out.println("Object is an electronic manufacturer");
		}
		else {
			System.out.println("Object status is unknown");
		}
		
		
		
			
		}
	}



