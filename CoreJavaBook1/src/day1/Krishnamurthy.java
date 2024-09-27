package day1;

import java.util.Scanner;

//Krishnamurthy or Not (Strong Number)

public class Krishnamurthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Integer Value : ");
		int n = sc.nextInt();
		int check = n;
		int sum=0;
		
		while(n!=0)
		{
			int temp = n%10;
			n=n/10;
			
			int f=1;
			for(int i=temp ;i>=2;i--)
			{
				f = f*i;
			}
			sum = sum + f;
			
		}
		
		if(sum==check)
		{
			System.out.print(check+" is a Krishnamurthy Number");
		}
		else
		{
			System.out.print(check+" is Not a Krishnamurthy Number");
		}
		
		
	}
	
//public static int fact(int digit)
//{
//	int f=1;
//	for(int i=digit ;i>=2;i--)
//	{
//		f = f*i;
//	}
//	
//	return f;
//}

}
