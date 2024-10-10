//Use distinct(), peek(), limit(), skip() methods on the list created in 2nd problem statement.

package day14_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HW_Quetion4 {
	
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,10,3,14,5,60,7,3,7,2,5));
		
		List<Integer> res = list.stream()
									.distinct()
									.peek(x->System.out.print(x+" "))
									.limit(6)
									.skip(1)
									.collect(Collectors.toList());
		
		System.out.println("\n"+Arrays.toString(res.toArray()));

		
		
		
		
		
	}
}
