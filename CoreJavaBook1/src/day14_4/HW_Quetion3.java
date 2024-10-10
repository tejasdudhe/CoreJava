//3. Sort the list created in 2nd problem statement first in ascending order and then descending order. Display the final list in each case. Print the total number of elements in  the list.

package day14_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HW_Quetion3 {
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,10,3,14,5,60,7));
		
		System.out.println("Ascending order : ");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("Decending order : ");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("count : "+list.stream().count()); 
		
		
		
		
		
	}
}
