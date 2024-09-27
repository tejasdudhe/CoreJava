package day2_1;

public class ChairMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair ch = new Chair();
		
		ch.setSize("Double");
		ch.setPrice(1000);
		ch.setColor("Yellow");
		ch.setType("Wooden");
		
		System.out.println("Chair Size : "+ch.getSize());
		System.out.println("Chair Price : "+ch.getPrice()+"Rs");
		System.out.println("Chair Color : "+ch.getColor());
		System.out.println("Chair Type : "+ch.getType());
	}

}

class Chair {

	String size;
	String type;
	String color;
	int price;
	

	public String getSize() {
		return size;
	}

	public void setSize(String si) {
		size = si;
	}

	public String getType() {
		return type;
	}

	public void setType(String ty) {
		type = ty;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String col) {
		color = col;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int pri) {
		price = pri;
	}

}
