package day14_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream1 {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<>(Arrays.asList(1, 22, 5, 53, 4, 8, 15, 6, 10));
		
		System.out.println("Ascending order : ");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("Decending order : ");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
