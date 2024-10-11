package day15_1;
import java.io.Serializable;
public class Employee implements Serializable
{
  int eid;
  String ename;
  int esal;
  transient String addr;
  public Employee() 
  {
	super();
  }
  public Employee(int eid, String ename, int esal, String addr) 
  {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
	this.addr = addr;
  }
  @Override
  public String toString() 
  {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", addr=" + addr + "]";
  }
  public void display()
  {
	System.out.println("Employee Id:"+eid);
	System.out.println("Employee Name:"+ename);
	System.out.println("Employee Salary:"+esal);
	System.out.println("Employee Addr:"+addr);
  }
}
