/*Write an abstract class MobilePhone with abstract method makeCall().
Inherit above class using class SimplePhone and override makeCall() method for printing audio calling.
Create another subclass SmartPhone of MobilePhone and override makeCall() method to print video calling.
Write a class Test with main() method. Using superclass MobilePhone reference 
create object of subclasses SimplePhone and SmartPhone and invoke makeCall() method.*/


package day7_2;

public abstract class MobilePhone {

	
	
	abstract public void makeCall();
}
