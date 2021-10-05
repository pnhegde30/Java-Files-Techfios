package homework7;

public class ImplementingOverload {
	
	static int plusMethod(int x, int y) {
		return x + y;
	}
	
	static double plusMethod(double x, double y) {
		return x + y;
	}
	
	static int minusMethod(int x, int y) {
		return x - y;
	}
	
	static double minusMethod(double x, double y) {
		return x - y;
	}

	public static void main(String[] args) {
		int myNum1 = plusMethod(8,5);
		double myNum2 = plusMethod(12.6, 8.7);
		int myNum3 = minusMethod(8,5);
		double myNum4 = minusMethod(12.6, 8.7);
		System.out.println("Int adding: " + myNum1);
		System.out.println("Double adding: " + myNum2);
		System.out.println("Int subtracting: " + myNum3);
		System.out.println("Double subtracting: " + myNum4);
	}

}
