package homework4;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
		int N;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a number");
		
		N = number.nextInt(); 
		PrintReverse(N);

	}
	static void PrintReverse(int N) {
		
		for (int i = N; i >= 0; i--)
			System.out.println(i + " ");
	}


}
