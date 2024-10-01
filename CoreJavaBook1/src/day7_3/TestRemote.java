package day7_3;

public class TestRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteDevice rd = new TV();
		rd.switchOn();
		rd.switchOff();
		
		rd = new DVDPlayer();
		rd.switchOn();
		rd.switchOff();
	}

}
