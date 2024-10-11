package day15_1;
import java.io.DataInputStream;
import java.io.IOException;
public class SystemDemo 
{
 public static void main(String[] args) 
 {
  try
   {
	DataInputStream din = new DataInputStream(System.in);
	System.out.println("Enter the String:");
	String data = din.readLine();
	System.out.println(data);
   }
   catch(IOException e) 
   {
	 e.printStackTrace();
   }
 }
}
