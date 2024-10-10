package day14_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,6,8,3,2,7,2,5, 4));
		
		List<Integer> res = list.stream()
								.filter(value -> value % 2==0)
								.peek(value -> System.out.println("Filtered value : "+value))
								.map(value -> value * 10)
								.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(res.toArray()));
		
		List<Integer> ans = list.stream()
								.distinct()
								.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(ans.toArray()));
		
		List<Integer> ans1 = list.stream()
				.limit(3)
				.collect(Collectors.toList());

		System.out.println(Arrays.toString(ans1.toArray()));
		
		List<Integer> ans2 = list.stream()
		.skip(5)
		.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(ans2.toArray()));

	}

}
