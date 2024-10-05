package day10_2;

public class SmallNumberException extends Exception{
	
	String msg;

	public SmallNumberException() {
		super();
		msg = "Exception : SmallNumberException";
	
	}

	public SmallNumberException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "SmallNumberException [msg=" + msg + "]";
	}
	
	@Override
	public String getMessage() {
		
		return "SmallNumberException [msg=" + msg + "]";
	}
	
	
}
