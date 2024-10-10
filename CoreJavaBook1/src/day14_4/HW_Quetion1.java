//1. Create an AraryList of 7 integers. Filter the elements that are divisible by 5. Display the numbers

package day14_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW_Quetion1 {
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,10,3,4,5,6,7));
		
		list.stream().filter(x-> x%5==0).forEach(System.out::println);
	}
}
