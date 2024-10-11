package day15_1;
import java.io.*;
import java.io.File;
import java.io.IOException;
public class FileUtility 
{
  public static void main(String[] args) 
	{
	   try {
		    File dir = new File("mydir");
			
			if(!dir.exists())
			{
				System.out.println("Directory created : " + dir.mkdir());
			}
			else
     		{
				File file = new File(dir, "hello.txt");
				if(!file.exists())
				{
  System.out.println("File created in directory " + dir.getName() + " : " + file.createNewFile());
				}
				else
				{
					System.out.println("File deleted: " + file.delete());
				}
			}
		}
	    catch (IOException e) 
	    {
			e.printStackTrace();
		}
	}
}
