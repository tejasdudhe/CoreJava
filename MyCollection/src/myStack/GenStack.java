package myStack;

public class GenStack<T> {
		
	protected T[] data;
	private static final int MAX_SIZE = 10;
	public int top;

	public GenStack() 
	{
		this(MAX_SIZE);
	}

	public GenStack(int size) 
	{
		this.data =(T[]) new Object[size];
		top = -1;
	}
	
	public boolean push(T item) throws StackException
	{
		if(isFull())
		{
//			System.err.println("Stack is Full....");
			throw new StackException("Stack is Full....S");
		}
		
		this.data[++top] = item;
		return true;
	}
	
	
	public T pop() throws StackException
	{
		if(isEmpty())
		{
//			System.err.println("Stack is Empty.....");
			throw new StackException("Can not pop from empty Stack");
		}
		
		return data[top--];
	}
	
	public T peek() throws StackException
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
