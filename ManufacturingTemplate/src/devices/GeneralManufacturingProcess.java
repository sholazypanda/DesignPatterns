package devices;

public abstract class GeneralManufacturingProcess {
	private String processName;
	
	public GeneralManufacturingProcess(String processName) {
		
		this.processName = processName;
	}
	protected abstract void assembly();
	protected abstract void testing();
	protected abstract void packaging();
	protected abstract void storage();
	// abstract methods are called in abstract class itself
	public void launchProcess(){
		if(!processName.isEmpty()){
			assembly();
			testing();
			packaging();
			storage();
		}
		else{
			System.out.println("/no Process name");
		}
	}
}