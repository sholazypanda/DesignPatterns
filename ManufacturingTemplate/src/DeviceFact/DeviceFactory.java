package DeviceFact;

import devices.GeneralManufacturingProcess;
import devices.Smartphones;

public class DeviceFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralManufacturingProcess gmp = new Smartphones("Nokia");
		gmp.launchProcess();
	}

}
