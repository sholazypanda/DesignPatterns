
public class SurroundSoundSystem implements Device{
	String name;
	public SurroundSoundSystem(String name) {
		
		this.name = name;
	}
	@Override
	public String toString() {
		return "SurroundSoundSystem [name=" + name + "]";
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("surround turned on");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("surround turned off");
	}
	
}
