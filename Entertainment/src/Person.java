
public class Person {

	
	public static void main(String args[]){
		//RemoteControl rm = new RemoteControl();
		//Person person1 = new Person("Mary");
		
		Projector projObj = new Projector("Horly");
		SurroundSoundSystem surrObj = new SurroundSoundSystem("Bose");
		TV tvObj = new TV("Sony");
		RemoteControl obj = RemoteControl.getInstance();
		obj.connectToDevice(projObj);
		obj.turnOn();
		
	}
}
