package homework7;

import java.util.*;

public class TestingPrivate  {
	
	private int x = 24;
	private int y = 42;
	private int z = 69;
	private String fname = "John";
	private String lname = "Doe";
	
		
	public static void main(String[] args) {
		TestingPrivate obj = new TestingPrivate();
		InhertPrivate newObj = new InhertPrivate();
		System.out.println("Name: " + obj.fname + " " + obj.lname);
		System.out.println("Age: " + obj.x);
		System.out.println("EmployeeID: " + obj.y);
		System.out.println("Favorite Number: " + obj.z);
		System.out.println("Testing Private: " + newObj.test);

	}

}
