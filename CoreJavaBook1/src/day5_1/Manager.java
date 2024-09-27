package day5_1;

public class Manager extends Employee {

	double Petrol_Allowance;
	double Food_Allowance;
	double Other_Allowance;

	public Manager() {

		Petrol_Allowance = 0.08 * (bSal);
		Food_Allowance = 0.13 * (bSal);
		Other_Allowance = 0.03 * (bSal);

		System.out.println("Manager constructor executed.......");
	}

	@Override
	public String toString() {

		super.toString();
		return "Petrol Allowance of Manager : " + Petrol_Allowance + "\n Food Allowance of Manager : " + Food_Allowance
				+ "\n  Other Allowance of Manager :" + Other_Allowance + "\n";
	}

}
