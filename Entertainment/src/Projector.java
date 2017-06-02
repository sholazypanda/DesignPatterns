
public class Projector implements Device{
	String name;

	@Override
	public String toString() {
		return "Projector [name=" + name + "]";
	}

	public Projector(String name) {
		
		this.name = name;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("projector turned on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("projector turned off");
	}
}
