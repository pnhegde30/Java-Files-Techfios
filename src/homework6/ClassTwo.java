package homework6;

public class ClassTwo {
	
	private String msg;
	private int value;
	static int num;
	
	ClassTwo() {
	System.out.println("This is the parent class");
	}
	
	//Constructor Chaining
	ClassTwo(String msg, int value){
		System.out.println("Parameterized Class printed");
		this.msg = msg; 
		this.value = value;
		num++;
		System.out.println(msg + " " + value);
	}
	
	void display() {
		System.out.println("Hello");
	}

}
