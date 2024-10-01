package day7_5;

public class Hostellers extends Student {
	
	private String hostelName;
	private int roomNo;
	
	public Hostellers()
	{
		
	}

	public Hostellers(int studId, String name, int depId,int phoneNo,String hostelName,int roomNo) {
		super(studId, name, depId,phoneNo);
		
		this.hostelName = hostelName;
		this.roomNo = roomNo;
		
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	
	public void Hostellers getHostelDetails() {
		
		System.out.println("...........Hostel Details...........\n");
		
	}
	

}
