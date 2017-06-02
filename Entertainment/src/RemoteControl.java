
public class RemoteControl {
	
	
	private static RemoteControl instance;
	private Device device=null;
	private RemoteControl(){
		
	}
	public static RemoteControl getInstance(){
		if(instance == null){
			instance = new RemoteControl();
		}
		return instance;
	}
	public void connectToDevice(Device adevice){
		this.device = adevice;
		System.out.println("connected to "+device.toString());
	}
	public void turnOn(){
		device.turnOn();
	}
	public void turnOff(){
		device.turnOff();
	}
		
	
	
}
