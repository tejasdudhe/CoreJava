package Lab24;

import java.util.Map;

public class UtilityReport {

	public void showReport(Map<String,Double> empSal)
	{
		for (Map.Entry<String,Double> entry : empSal.entrySet()) {
				
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
