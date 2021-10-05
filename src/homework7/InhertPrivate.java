package homework7;

public class InhertPrivate extends TestingPrivate {
	
	protected String pepper = "Pepper";
	protected String test = "Word";
	
	public static void main() { 
		TestingPrivate obj = new TestingPrivate();
		InhertPrivate newObj = new InhertPrivate();
		System.out.println("Test Pepper: " + newObj.test + " " + newObj.pepper);
		//System.out.println("Test: " + obj.z);
	}

}
