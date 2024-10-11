package day15_1;
import java.util.Scanner;
public class TokenizingUsingScanner 
{
 public static void main(String[] args) 
 {
		String skillsSet = "C C++ Java WCD Struts";
		Scanner sc = new Scanner(skillsSet);
		while(sc.hasNext()){
			String skill = sc.next();
			System.out.println(skill);
		}
	}

}
