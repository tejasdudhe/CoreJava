package day10_3;

public class AgeException extends Exception{

	String msg;

	public AgeException() {
		super();
		msg = "Exception : AgeException";
	
	}

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "AgeException [msg= " + msg + "]";
	}

	@Override
	public String getMessage() {

		return "AgeException [msg= " + msg + "]";
	}
}
