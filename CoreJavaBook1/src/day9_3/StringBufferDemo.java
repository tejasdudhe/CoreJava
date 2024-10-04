package day9_3;

public class StringBufferDemo {
	
	   public static void main(String[] args) {
		
		   StringBuffer sb1= new StringBuffer();
		   System.out.println("size:"+sb1.length());
		   System.out.println("capacity:"+sb1.capacity());
		  
		   sb1.append("Hello World ! wel");
		   System.out.println("size:"+sb1.length());
		   System.out.println("capacity:"+sb1.capacity());
		  
		   StringBuffer sb2= new StringBuffer("Hello");
		   StringBuffer sb3= new StringBuffer("Hello");
		   StringBuffer sb4= sb2;
		   
		   //Its memory location
		   System.out.println("sb2 equsla sb3:"+sb2.equals(sb3));
		   System.out.println("sb2 equsla sb4:"+sb2.equals(sb4));
		   
		   //Its memory location
		   System.out.println("sb2 == sb3:"+(sb2==sb3));
		   System.out.println("sb2 == sb4:"+(sb2==sb4));
		   
		   System.out.println("sb2 hashcode:"+sb2.hashCode());
		   System.out.println("sb3 hashcode:"+sb3.hashCode());
		   System.out.println("sb4 hashcode:"+sb4.hashCode());
	}
}
