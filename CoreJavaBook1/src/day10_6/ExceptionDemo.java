package day10_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\SEED_SPIC\\CoreJAVA\\CoreJavaBook1\\src\\day10_6\\F1.txt");
			int data = 0;
			while ((data = fis.read()) != -1) {
				if ((char) data == 'z')
					throw new SecurityException("Testing...");
				System.out.print("" + (char) data);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
