package day14_3;

import java.util.stream.Stream;

public class DemoStream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Parallel stream and ForEach");

		Stream.of("AAA", "BBB", "CCC").parallel().forEach(x -> System.out.println("value : " + x));

		System.out.println("Parallel stream and forEachOrdered");

		Stream.of("AAA", "BBB", "CCC").parallel().forEachOrdered(x -> System.out.println("value : " + x) );

	}

}
