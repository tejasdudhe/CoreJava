package day14_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 22, 5, 53, 4, 8, 1, 6, 10));
		List<Integer> res = list.stream()
								.filter(value -> value % 2 == 0)
								.map(value -> value * 3)
								.collect(Collectors.toList());

		System.out.println(Arrays.toString(res.toArray()));

	}

}
