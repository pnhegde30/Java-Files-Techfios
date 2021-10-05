package homework4;

import java.util.Scanner;

public class Combination {
	//Combination of NVar.java and Alternative.java
	
	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in); 
		System.out.println("Enter a number");
		int N = ui.nextInt();
		int number, count;
		
		if(N > 0) { 
			for(int i = N ; i >= 0 ; i--) { //i = i-1 is also equal to i=-1 also equal to i--
				System.out.println(i);
			}
		}
		else {
			System.out.println("Input must be greater than 0");
		}
		
		System.out.println("--------------------------------");
		System.out.println("Pattern: ");
		for (count = 1; count <= N; count++) {
			if( count > 1) {
			number =  ((count-1) * 4);
			System.out.println(number);
			}
			else if (count == 1) {
				number = 1;
				System.out.println(number);
			}
		}

	}

}
