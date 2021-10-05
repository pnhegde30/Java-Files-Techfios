package homework8;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class RandomRange {

	public static void main(String[] args) {
		int n = 0;
		int start = 100;
		int end = 500;
		int sizeArray = end-start;
		int[] num = new int[sizeArray +1];
		Random ranNum = new Random();
		
		int a = n++;
		int number = 0;
		int small = 1000;
		//ranNum.nextInt(1000);
		
		System.out.println("Random numbers:");
			for(int counter = start; counter <= end; counter++) {
				number = ThreadLocalRandom.current().nextInt(100, 1001);
				if(number < small) {
					small = number;
				}
					
				System.out.println(number);
				
				
			}
		
		//System.out.println("Largest Number is : " + big);
		System.out.println("Smallests Number is : " + small);

	}

}
