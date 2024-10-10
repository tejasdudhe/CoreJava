package day14_1;

public interface PersonComparator {
	
	public static int compareAge(Person p1,Person p2) {
		
		return p1.getAge() - p2.getAge();
	}
}
