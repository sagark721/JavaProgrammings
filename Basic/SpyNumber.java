package Basic;

import java.util.Scanner;

public class SpyNumber {
	
	static String isSpy(int num)
	{
		
	
	int sum=0;
	int prod=1;
	
	while(num>0)
	{
		int rem=num%10;
		sum+=rem;
		prod*=rem;
		num=num/10;
	}
	
	if (sum==prod)
		return "Spy";
	else
		return "Not a Spy";
		
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		System.out.println(isSpy(num));
		
		
		
	}

}
