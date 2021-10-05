package homework5;

import java.util.*;

public class Homework5 {

	public static void main(String[] args) {
		double num1, num2; 
		double ans; 
		char math; 
		Scanner op = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1 = op.nextDouble();
		num2 = op.nextDouble();
		System.out.println("\nEnter a basic operator (+, -, *, /): ");
		math = op.next().charAt(0);
		switch(math) {
			case '+' : ans = num1 + num2; 
				break; 
			case '-' : ans = num1 - num2; 
				break; 
			case '*' : ans = num1 * num2; 
				break; 
			case '/' : ans = num1 / num2;
				break; 
			default: System.out.println("Error: Please enter the correct operator");
				return; 
		}
		System.out.print("\nThe result is: ");
		System.out.println(num1 + " " +  math + " " + num2 + " = " + ans);
		
		if(ans % 2 == 0) {
			System.out.println("The answer " + ans + " is even");
		}
		else { 
			System.out.println("The answer " + ans + " is odd");
		}

	}

}
