

/*
 
 	Lab Exercise -26

		Objective
		
		Obtaining annotations using reflection technique.
		Pre-condition
		
		Employee class should be created.
		ReflectDemo class should be created.
		Problem Statement
		
		Create an Annotation 'CityInfo' which have attributes like ct_name and zip. Annotate the getInfo()
		method of Employee class. Find out information of annotation using Reflect Demo class
 
 */

package lab26;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashSet;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		HashSet<String> sk = new HashSet<String>();
		sk.add("java");
		sk.add("Python");
		Employee e = new Employee(101,"tejas",50000,sk);
		
		Class c = e.getClass();
		try {
            Method m = c.getMethod("getInfo"); 
            
            // Check if the CityInfo annotation is present
            CityInfo ct = m.getAnnotation(CityInfo.class); 
            
            if (ct != null) {
                System.out.println("Employee Info: " + e.getInfo()); 
                System.out.println("City: " + ct.ct_name());
                System.out.println("Pin Code: " + ct.pin_code());
            } else {
                System.out.println("CityInfo annotation is not present on the getInfo() method.");
            }
        } catch (NoSuchMethodException e1) {
            System.err.println("Method not found: " + e1.getMessage());
        }
    }
		
		
}