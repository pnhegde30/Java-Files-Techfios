package homework7;

public class Bike {

	public int gear; 
	public int speed;
	
	public static void main(String[] args) {
		
		BicycleRoad br = new BicycleRoad(4, 12, 35);
		System.out.println(br.info());

	}
	
	public Bike(int gear, int speed) {
		this.gear = gear;
		this.speed = speed; 
	}
	
	public void slow(int rev) {
		speed -= rev;
	}
	
	public void up(int rev) {
		speed = rev++;
	}
	
	public String info() {
		return("No of gears: " + gear + "\nand speed: " + speed);
	}

}
