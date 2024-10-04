package day9_3;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Javavavavava";
		
		String check = "va";
		int lenC = check.length();
		
		int cnt = 0;
		

		for (int i = 0; i < str1.length() - 1; i++) {
//			if(str1.charAt(i) == 'v' && str1.charAt(i+1) == 'a');
//			{
//				cnt++;
//			}

			if (str1.substring(i,i+lenC).equals(check))
				cnt++;
		}

		System.out.println("Count of va in str1 : " + cnt);

	}

}
