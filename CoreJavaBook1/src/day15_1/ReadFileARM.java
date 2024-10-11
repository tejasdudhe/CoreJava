package day15_1;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadFileARM 
{
	public static void main(String[] args) 
	{
	
		try(FileInputStream fin=new FileInputStream ("data.txt"); )
		{
		
			int data=0;
			while((data=fin.read())!=-1)
				System.out.print((char)data);
		}
		catch (Exception e)
		{
			
		   e.printStackTrace ();
		}
	}

}
