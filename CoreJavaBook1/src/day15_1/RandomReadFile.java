package day15_1;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomReadFile 
{
 public static void main(String[] args) throws IOException 
 {
  RandomAccessFile rin=null;
  try{
	  rin=new RandomAccessFile ("data.txt","r");
	  rin.seek(6);
	  System.out.println("File pointer position: " + rin.getFilePointer() + "\n");
	  long c=rin.getFilePointer();
	  int data=0;
	  for(long i=c;i<rin.length();i++)
	  {
	     data=rin.read();
		 System.out.print((char)data);
	  }
	   System.out.println("\n\nEnd File pointer position: " + rin.getFilePointer());
	   System.out.println("\n\nEnd File pointer position: " + rin.length());
	 }
     catch (Exception e)
     {
	   e.printStackTrace ();
	 }
     finally
     {
				rin.close();
	  } // closes the stream in any case
    }
}

