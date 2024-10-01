package day7_3;

public class DVDPlayer implements RemoteDevice {
	
	@Override
	public void switchOn() {
		System.out.println("DVD : SwitchOn");
	}
	
	@Override
	public void switchOff() {
		System.out.println("DVD : SwitchOff");
	}

}
