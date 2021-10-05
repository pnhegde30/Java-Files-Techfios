package homework8;

import java.util.*;

public class DupeDisplay {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = in.nextLine(); 
		int count; 
		char[] sc = str.toCharArray();
		System.out.println("Duplicate Characters are: ");
		for(int i = 0; i < str.length()  ; i++) {
			count = 1;
			for(int j = i + 1; j < str.length() ; j++) {
				if (sc[i] == sc[j]) {
					count++;
					
					//Set string[j] to 0 to avoid printing visited character
					sc[j] = '0';
				}
			}
			if(count > 1 && sc[i] != '0') {
				System.out.println(sc[i]);
			}
		}
		
	}

}
