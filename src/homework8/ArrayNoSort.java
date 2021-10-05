package homework8;

import java.io.IOException;
import java.util.*;

public class ArrayNoSort {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many numbers you want in your array : ");
		
		int[] numArray = new int[10];
		int num;
		ArrayNoSort ans = new ArrayNoSort();
		num = input.nextInt();
		
		System.out.println("Enter the integers : ");
		
        for (int i = 0;i < num; i++)
        {
            numArray[i] = input.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i = 0; i < num; i++) {
        	System.out.println(i+1+") " + numArray[i]);
        }
        int[] des = ans.toDescendingOrder(numArray); //creates private int method
        int[] asc = ans.toAscendingOrder(numArray); //creates private int method
        System.out.println("--------Descending Order--------");
        	  for(int i=0;i<des.length;i++){
        	   System.out.print(des[i]+"\t");
        	  }
        	  System.out.println("");
        	  System.out.println("--------Ascending Order--------");
        	  for(int i=0;i<asc.length;i++){
        	   System.out.print(asc[i]+"\t");
        	  }
        }

	

	private int[] toAscendingOrder(int[] numArray) {
		int temp;
		for(int i=0;i<numArray.length-1;i++){
			for(int j=0;j<numArray.length-1-i;j++){
				if(numArray[j]>numArray[j+1]){
					temp=numArray[j];
					numArray[j]=numArray[j+1];
					numArray[j+1]=temp;
		    }
		   } 
		  }
		return numArray;
	}

	private int[] toDescendingOrder(int[] numArray) {
		int[] x = toAscendingOrder(numArray);
		int[] y = new int[x.length];
		int zero = 0;
		for(int i = x.length-1 ; i >= 0 ; i--) {
			y[zero] = x[i];
			zero++;
		}
		return y;
	}

}
