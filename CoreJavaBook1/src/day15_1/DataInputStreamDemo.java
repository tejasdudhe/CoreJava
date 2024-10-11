package day15_1;
import java.io.DataInputStream;
import java.io.IOException;
public class DataInputStreamDemo 
{
 public static void main(String[] args) throws IOException 
 {
  DataInputStream dis= new DataInputStream(System.in);
  System.out.println("Enter the Name:");
  String name=dis.readLine();
  System.out.println("Enter the Age:");
  int age=dis.readInt();
  System.out.println("Enter the height:");
  float h=dis.readFloat();
  
  System.out.println("Name:"+name);
  System.out.println("Age:"+age);
  System.out.println("Height:"+h);
	  
  

 }//end main
}//end class
