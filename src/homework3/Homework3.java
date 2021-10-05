package homework3;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class Homework3 {

	public static void main(String[] args) {
		
		String input;
		String strData = "";
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a string");
		
		input = userInput.nextLine();
		
		System.out.println(input.toUpperCase());
		System.out.println(input.length());
		
		
		if(input.contains("O")) {
		strData = input.replace("O", "Z");
		System.out.println(strData);
		}
		else if ( input.contains("o")) {
		strData = input.replace('o', 'z');
		System.out.println(strData);
		}
		
		//int maxIdex = input.length()-1;
		//System.out.println(input.charAt(maxIdex));
		
		System.out.println("Last Character: " + strData.charAt(input.length()-1));
		
		String strJoin;
		Scanner newInput = new Scanner(System.in);
		System.out.println("Please enter another string");
		
		strJoin = newInput.nextLine(); 
		
		System.out.println(input.concat(strJoin));
		System.out.println(strData.concat(strJoin));
		

	}

}
