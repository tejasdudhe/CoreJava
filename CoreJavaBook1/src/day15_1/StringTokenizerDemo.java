package day15_1;
import java.util.StringTokenizer;
public class StringTokenizerDemo 
{
 public static void main(String[] args) 
	{
		String skillsSet = "C,C++,Java, WCD,Struts";
		StringTokenizer st = new StringTokenizer(skillsSet, " ");
		while(st.hasMoreTokens()){
			String skill = st.nextToken();
			System.out.println(skill);
		}
	}

}
