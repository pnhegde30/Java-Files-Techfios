package homework4;

import java.util.Scanner;

public class WordArray {
	public static void main(String[] args) {
		//Ask the user for a word and print each character one by one
		
		Scanner ui = new Scanner(System.in);
		int count = 1;
		
		System.out.println("Please enter your word(s): ");
		String word = ui.nextLine(); 
		
		for(char individual : word.toCharArray()) {
			//System.out.print(count++ + ">>" + individual + " ");
			System.out.println(individual);
		}
	}
}
