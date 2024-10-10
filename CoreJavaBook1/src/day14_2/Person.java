package day14_2;

public class Person {
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	int age;
	String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		
		System.out.println("Contructor is Called");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
