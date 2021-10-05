package homework5;

import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner usrIn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = usrIn.nextInt();
		
		if (number % 2 != 0) {
			System.out.println("Entered number is ODD");
		}
		else {
			System.out.println("Entered number is EVEN");
		}



	}

}
