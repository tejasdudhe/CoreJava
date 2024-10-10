package day14_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestMain {

	public static void main(String[] args) {
		
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add(new Person(22,"Akash"));
		arr.add(new Person(12,"Pravav"));
		arr.add(new Person(52,"Ayush"));
		
		Collections.sort(arr,PersonComparator::compareAge);
		
		for (Person person : arr) {
			System.out.println(person.getName());
		}
		
		NameComparator Obj = new NameComparator();
		
		Collections.sort(arr,Obj::compareName);
		
		for (Person person : arr) {
			System.out.println(person.getName()+"----"+person.getAge());
		}
		
		
		String[] str = {"Pune","Amravati","Nagpur","Mumbai"};
		
		Arrays.sort(str,String::compareToIgnoreCase);
		
		for (String s : str) {
			System.out.println(s+ " ");
		}
		
		
	}

}
