package day10_5;

public class InvalidPasswordException extends Exception {

	String msg;
	public InvalidPasswordException() {
		super();
	}

	public InvalidPasswordException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidPasswordException [msg= " + msg + "]";
	}
	
	@Override
	public String getMessage() {
		
		return "InvalidPasswordException :" + msg;
		
	}
}
