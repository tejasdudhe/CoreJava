package day15_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo 
{
 public static void main(String[] args) throws IOException, ClassNotFoundException 
 {
   Employee e1=null;
   try
   {
     FileInputStream fin= new FileInputStream("data.txt");
     ObjectInputStream ois= new ObjectInputStream(fin);
     e1=(Employee) ois.readObject();
     e1.display();
   }
   catch (FileNotFoundException e) 
   {
	e.printStackTrace();
   }
	 
 }//end main
}//end class
