package day9_1;

public class Outer {
	
	public int n;
	   
	   Employee e1= new Employee()
	   {  // start
		 int incentives=1000; 
		 
	     @Override
	     public void display() 
	     {
	      super.display();
	      System.out.println("Employee Incentives:"+incentives);
	     }
	     
	   };  //end class
		
	   
	   I1 iob = new I1() 
	   {
		@Override
		public void show() 
		{
		  System.out.println("Hi ! from show method..");
			
		}
	   };
	   
	   
}

