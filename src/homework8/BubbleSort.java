package homework8;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar1 = new int[] {45, 12, 4, 5, 69, 42, 78, 32, 25, 9};
		System.out.println("Array Elements >> ");
		System.out.println(Arrays.toString(ar1));
		
		for(int i=0;i<ar1.length-1;i++){
			for(int j=0;j<ar1.length-1-i;j++){
				int temp = 0;
			  if(ar1[j]>ar1[j+1]){
			     temp=ar1[j];
			     ar1[j]=ar1[j+1];
			     ar1[j+1]=temp;
			    }
			   } 
			  }
		System.out.println("Sorted Array >> " + "\t");
		System.out.println(Arrays.toString(ar1));

	}

}
