package vehicle;

import parts.Engine;

public class Vehicle {
	private Engine myengine;

	public Vehicle(Engine myengine) {
		
		this.myengine = myengine;
	}
	public void crankIgnition(){
		System.out.println(myengine.startEngine());
	}
}
