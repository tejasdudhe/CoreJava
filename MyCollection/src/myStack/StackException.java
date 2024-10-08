package myStack;

public class StackException extends Exception {
	
	public String message;
	
	public StackException() {
		super();
		
	}

	public StackException(String message) {
		
		this.message = message;
		
	}
	
	
	@Override
	public String toString() {
		return "StackException [msg = " + message + "]";
	}
	
	@Override
	public String getMessage() {
		
		return "StackException :" + message;
		
	}
	
	
}
