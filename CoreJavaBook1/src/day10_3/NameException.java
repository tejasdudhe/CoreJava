package day10_3;

public class NameException extends Exception {
	String msg;

	public NameException() {
		super();
		msg = "Exception : NameException";
	
	}

	public NameException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "NameException [msg= " + msg + "]";
	}

	@Override
	public String getMessage() {

		return "NameException [msg= " + msg + "]";
	}
}
