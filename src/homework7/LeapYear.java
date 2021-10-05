package homework7;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = in.nextInt();
		
		if(isLeap(year) == true) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
		
	}
	
public static boolean isLeap(int y) {
	boolean a = (y % 4) == 0;
	boolean b = (y % 100) != 0;
	boolean c = ((y % 100 == 0) && (y % 400 == 0));
	
	return a && (b||c);
}

}
