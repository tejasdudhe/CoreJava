package day10_2;

public class ProperNumberException extends Exception {

	String msg;

	public ProperNumberException() {
		super();
		msg = "Exception : SmallNumberException";
	
	}

	public ProperNumberException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ProperNumberException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {

		return "ProperNumberException [msg=" + msg + "]";
	}
}
