package homework4;

import java.util.Scanner;

public class Alternative {
	public static void main(String[] args) {
	//Given N - print backward to 0
	
	Scanner ui = new Scanner(System.in); 
	System.out.println("Please enter a number");
	int N = ui.nextInt();
	
	if(N > 0) { 
		for(int i = N ; i >= 0 ; i--) { //i = i-1 is also equal to i=-1 also equal to i--
			System.out.println(i);
		}
	}
	else {
		System.out.println("Input must be greater than 0");
	}
	
	
} 
}
