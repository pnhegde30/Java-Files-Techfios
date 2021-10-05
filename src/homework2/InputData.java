package homework2;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		Scanner userInputStr = new Scanner(System.in);
		Scanner userInputint = new Scanner(System.in);
		Scanner userInputloc = new Scanner(System.in);
		Scanner userInputwork = new Scanner(System.in);
		Scanner userInputsalary = new Scanner(System.in);
		
		System.out.println("What is you name?");
		String name = userInputStr.nextLine();
		
		System.out.println("How old are you?");
		int age = userInputint.nextInt();
		
		System.out.println("What is your gender?");
		String gender = userInputStr.nextLine(); 
		
		System.out.println("Where are you from?");
		String from = userInputloc.nextLine(); 
		
		System.out.println("Where do you live now?");
		String live = userInputloc.nextLine(); 
		
		System.out.println("Where do you work?");
		String job = userInputwork.nextLine(); 
		
		System.out.println("What is your job role?");
		String role = userInputwork.nextLine();
		
		System.out.println("What is your salary?");
		float salary = userInputloc.nextFloat(); 
		
		System.out.println("How much raise are you getting next year?");
		float raise = userInputloc.nextFloat(); 
		
		float total = raise + salary; 
		
		//System.out.printf("%.2f", salary, raise);
		System.out.print("My name is " + name + ". I am " + age + " years old, " + gender + ".");
		System.out.println(" I work at " + job + " as " + role + ". I currently live in " + live + ".");
		System.out.print("I am originally from " + from + ".");
		System.out.print("I make ");
		System.out.printf("%.2f", salary);
		System.out.print(" dollars. I will get ");
		System.out.printf("%.2f", raise);
		System.out.print(" dollars as annual raise so \nmy total salary will be ");
		System.out.printf("%.2f", total);
		System.out.print(" dollars next year.");

	}

}
