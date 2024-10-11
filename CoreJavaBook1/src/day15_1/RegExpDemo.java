package day15_1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExpDemo 
{
 public static void main(String[] args) 
  {
   Pattern pattern = Pattern.compile("abc");
   Matcher matcher = pattern.matcher("aab bc abcc aabc%$ 23s abbc %345 abc");
   while(matcher.find())
     {
       System.out.println("Group: " + matcher.group());
	  }
   }
}
