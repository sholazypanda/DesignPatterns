package devices;

public class Smartphones extends GeneralManufacturingProcess {

	public Smartphones(String processName) {
		super(processName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assembly() {
		// TODO Auto-generated method stub
		System.out.println("assembled smartphone");
	}

	@Override
	protected void testing() {
		// TODO Auto-generated method stub
		System.out.println("tested smartphone");
	}

	@Override
	protected void packaging() {
		// TODO Auto-generated method stub
		System.out.println("packaged smartphone");
	}

	@Override
	protected void storage() {
		// TODO Auto-generated method stub
		System.out.println("storage smartphone");
	}

}
