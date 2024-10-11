package day15_1;
import java.io.*;
public class ReadFile 
{
	public static void main(String[] args) 
	{
	    File f=new File("D:\\JavaPrograms\\CoreJavaDemos\\CoreJavaBook2\\src\\day15_1\\f1.txt");
		
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try
		{
		 fin=new FileInputStream (f);
		 fout=new FileOutputStream("f2.txt",true);
		 int data=0;
		 while((data=fin.read())!=-1)
		 {
			System.out.print((char)data);
		    char ch=(char)data; 
		    fout.write(data);
		 }
		 }
		catch(FileNotFoundException e)
		{
		   e.printStackTrace ();
		}
		catch(IOException e)
		{
		   e.printStackTrace ();
		}
		finally
		{
		  try 
			{
				fin.close();
			}
		  catch(IOException e) 
			{
				e.printStackTrace();
			}
		 }
   }
}
