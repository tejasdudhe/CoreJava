package day7_4;

public class TestClone implements Cloneable 
{
  int x;
  int y;
  public TestClone() 
  {
	x=y=0;
  }
  public TestClone(int x,int y) 
  {
	this.x=x;
	this.y=y;
  }
  @Override
  public String toString() 
  {
	return " [x="+x+" y="+y+"]";
  }	
  /*@Override
  protected Object clone() throws CloneNotSupportedException 
  {
		return super.clone();
  }*/
  
  @Override
  protected TestClone clone() throws CloneNotSupportedException 
  {
	   TestClone temp= new TestClone();
		temp.x=this.x;
		temp.y=this.y;
		return temp;
  }
  public static void main(String[] args) throws CloneNotSupportedException 
  {
    TestClone d1= new TestClone(10,20);
    TestClone d2= d1;// Shallow cloning 
    System.out.println("d1:"+d1);
    System.out.println("d2:"+d2);
    TestClone d3=d1.clone();
    System.out.println("d3:"+d3);
    System.out.println("d1:"+d1.hashCode());
    System.out.println("d2:"+d2.hashCode());
    System.out.println("d3:"+d3.hashCode());
    

  }//end main
}//end class