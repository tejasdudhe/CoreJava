package day15_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderDemo 
{
 public static void main(String[] args) throws IOException 
 {
   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the Name:");
   String name=br.readLine();
   System.out.println("Enter the Age:");
   int age=Integer.parseInt(br.readLine());
   System.out.println("Enter the height:");
   float h=Float.parseFloat(br.readLine());
   
   System.out.println("Name:"+name);
   System.out.println("Age:"+age);
   System.out.println("Height:"+h);
	  

 }//main end
}//end class
