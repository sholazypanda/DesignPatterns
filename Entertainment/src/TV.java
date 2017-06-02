
public class TV implements Device{
	String name;

	public TV(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return "TV [name=" + name + "]";
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv turned on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv turned off");
	}
	
}
