package Basic;

import java.util.Scanner;

public class PerfectNumber {
	
	static String isPerfect(int num)
	{
		int i=1;
		int sum=0;
		
		while(i<=(num/2))
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		
		if (sum==num)
			return "Hi";
		else
			return "Bye";
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int num=s.nextInt();
		
		System.out.println(isPerfect(num));
		
		
		for (int i=0;i<100000000;i++)
		{
			if (isPerfect(i).equals("Hi"))
			System.out.println(i);
		}
		

	}

}
