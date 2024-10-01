package day7_3;

public class TV implements RemoteDevice {
		
	@Override
	public void switchOn() {
		System.out.println("TV : SwitchOn");
	}
	
	@Override
	public void switchOff() {
		System.out.println("TV : SwitchOff");
	}
}
