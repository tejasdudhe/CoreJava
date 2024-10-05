package day10_2;

public class GreaterNumberException extends Exception{

	String msg;

	public GreaterNumberException() {
		super();
		msg = "Exception : SmallNumberException";
	
	}

	public GreaterNumberException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "GreaterNumberException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {

		return "GreaterNumberException [msg=" + msg + "]";
	}
}
