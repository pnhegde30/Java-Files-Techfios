package homework6;

import java.util.*;

public class ProjectModifiers {

	public static void main(String[] args) {

		char selectType;
		Scanner sc = new Scanner(System.in);
		System.out.println("There are four types of Java access modifiers: Private, Default, Protected, Public ");
		System.out.println("Please type a number from 0-3 to learn more: ");

		selectType = sc.next().charAt(0);
		switch(selectType) {
			case '0' : System.out.println("Private: The access level is only within the class.\nIt cannot be accessed from outside the class. ");
				break; 
			case '1' : System.out.println("Default: The access level is only within the package. \nIf you didn't specify any access level, it will be default. ");
				break; 
			case '2' : System.out.println("Protected: The access level is within the package and outside the package through child class. \nIf you don't make the child class, it cannot be accessed from outside the package. ");
				break; 
			case '3' : System.out.println("Public: The access level is everywhere. \nWithin class, outside class, within package, and outside package. ");
				break;
			default: System.out.println("Please type a number from 0 -3");
				return;
		}
		

	}

}
