package homework7;

import java.util.*;

public class BicycleRoad extends Bike{

	public int tire;
	
	protected BicycleRoad(int gear, int speed, int thread) {
		super(gear, speed);
		tire = thread;
		
	}
	
	public void extra_method(int newValue) {
		tire = newValue;
	}
	
	@Override
	public String info() {
		return (super.info() + "\nTire thread level: " + tire);
		
	}

}
