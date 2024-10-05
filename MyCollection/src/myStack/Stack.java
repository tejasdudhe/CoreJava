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
	
	public boolean push(int item)
	{
		if(isFull())
		{
			System.err.println("Stack is Full....");
			return false;
		}
		
		this.data[++top] = item;
		return true;
	}
	
	
	public int pop() throws Exception
	{
		if(isEmpty())
		{
//			System.err.println("Stack is Empty.....");
			throw new Exception("Can not pop from empty Stack");
		}
		
		return data[top--];
	}
	
	public int peek() throws Exception
	{
		if(isEmpty())
		{

			throw new Exception("Can not peek from empty Stack");
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
