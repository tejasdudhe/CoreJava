package myStack;

public class Stack {

	protected int[] data;
	private static final int MAX_SIZE = 10;
	public int top;

	public Stack() 
	{
		this(MAX_SIZE);
	}

	public Stack(int size) 
	{
		this.data = new int[size];
		top = -1;
	}
	
	public boolean push(int item) throws StackException
	{
		if(isFull())
		{
//			System.err.println("Stack is Full....");
			throw new StackException("Stack is Full....S");
		}
		
		this.data[++top] = item;
		return true;
	}
	
	
	public int pop() throws StackException
	{
		if(isEmpty())
		{
//			System.err.println("Stack is Empty.....");
			throw new StackException("Can not pop from empty Stack");
		}
		
		return data[top--];
	}
	
	public int peek() throws StackException
	{
		if(isEmpty())
		{

			throw new StackException("Can not peek from empty Stack");
		}
		
		return data[top];
	}
	
	
	private boolean isFull() 
	{
		return top == data.length-1;
	}
	
	
	private boolean isEmpty() 
	{
		return top == -1;
	}

}
