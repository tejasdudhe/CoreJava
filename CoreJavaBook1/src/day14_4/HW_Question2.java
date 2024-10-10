
//2. Create an AraryList of 7 integers. Multiply every element by 5. Display the numbers.

package day14_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HW_Question2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 10, 3, 4, 5, 6, 7));

		List<Integer> res = list.stream().map(x -> x * 5).collect(Collectors.toList());
		
		System.out.println(Arrays.toString(res.toArray()));
	}

}
