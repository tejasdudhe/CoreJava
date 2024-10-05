package day10_5;

public class InvalidUserNameException extends Exception {
	String msg;
	public InvalidUserNameException() {
		super();
	}

	public InvalidUserNameException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidUserNameException [msg= " + msg + "]";
	}
	
	@Override
	public String getMessage() {
		
		return "InvalidUserNameException :" + msg;
		
	}
}
