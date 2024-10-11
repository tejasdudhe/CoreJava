package day15_1;
import java.io.*;
public class WriteFile 
{
	public static void main(String[] args) 
	{
	
		FileOutputStream fout=null;
		try
		{
		 fout=new FileOutputStream("data.txt",false);
		 String s = "SEED Infotech Ltd\nPune\tIndia";
		 for(int i=0;i<s.length();i++)
			 fout.write(s.charAt(i));
		     System.out.println("data is written successfully");
		 }
		catch (Exception e)
		{
		   e.printStackTrace ();
		}
		finally
		{
			try 
			{
				fout.close();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			} // closes the stream in any case
		 }

	}

}
