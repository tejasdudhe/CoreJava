package day10_1;

public class NegativeNumberException extends Exception {

	String msg;
	public NegativeNumberException() {
		super();
	}

	public NegativeNumberException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "NegativeNumberException [msg=" + msg + "]";
	}
	
	@Override
	public String getMessage() {
		
		return "NegativeNumberException :" + msg;
		
	}

}
