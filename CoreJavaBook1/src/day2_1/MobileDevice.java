package day2_1;

public class MobileDevice {
	
	String companyName;
	String modelName;
	float price;
	int ram;
	
	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String cName) {
		companyName = cName;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modName) {
		modelName = modName;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float pri) {
		price = pri;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int rm) {
		ram = rm;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileDevice Md = new MobileDevice();
		Md.setCompanyName("Redmi");
		Md.setModelName("Note 9");
		Md.setPrice(20000);
		Md.setRam(16);
		
		System.out.println("Company Name : "+Md.getCompanyName());
		System.out.println("Model Name : "+Md.getModelName());
		System.out.println("Price : "+Md.getPrice()+"Rs");
		System.out.println("Ram : "+Md.getRam()+"GB");
	}

}


