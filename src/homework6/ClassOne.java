package homework6;

public class ClassOne{
	

//    One with the main method (ClassOne.java)
//    One without the main method (ClassTwo.java)
//    Create a Constructor Chain inside the ClassTwo.java
//    Create object in ClassOne.java to invoke the constructor chain


	public static void main(String[] args) {
		
		ClassOne c1 = new ClassOne();
		ClassTwo c2 = new ClassTwo("Word", 10);
		c1.display();
		c2.display();

	}
	
	//Parameterized Constructor
	public ClassOne(String msg) {
		System.out.println(msg);
	}
	
	//Default Constructor
	public ClassOne() {
		System.out.println("Default Constructor printed");
	}
	
	void display() { 
		System.out.println("Display");
	}
	
	

}
