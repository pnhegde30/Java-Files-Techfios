package homework4;

import java.util.*;

public class NVar {
	public static void main(String[] args){
		//Given N -- print this pattern up to N: 1, 4, 8, 12, 16, 20...
		
		int N = 0;
		int number, count;
		Scanner ui = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		N = ui.nextInt();
		
		for ( count = 1; count <= N; count++) {
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

