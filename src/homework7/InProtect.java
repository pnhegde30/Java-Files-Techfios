package homework7;

public class InProtect extends TestingPrivate {
	
	protected String pepper = "Pepper";
	String test = "Test";
	
	public static void main() { 
		TestingPrivate obj = new TestingPrivate();
		InhertPrivate newObj = new InhertPrivate();
		System.out.println("Test Pepper: " + newObj.test + " " + newObj.pepper);
		//System.out.println("Test: " + obj.z);
	}

}
