package Basic;

import java.util.Scanner;

public class StrongNumber {
	
	static String isStrong(int num)
	{int temp=num;
	int sum=0;
	
	while(num>0)
	{
		int rem=num%10;
		
		int fact=1;
		while(rem>=1)
		{
			fact=fact*rem;
			rem--;
		}
		sum=sum+fact;
		num=num/10;
		
	}
	
	if (sum==temp)
		return "Number is Strong";
	
	else
		return "Number is not Strong";
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num=s.nextInt(); //145	
		
		
		
		System.out.println(isStrong(num));
		
		for (int i=0;i<100000000;i++)
		{
			if (isStrong(i).equals("Number is Strong"))
			System.out.println(i);
		}
		
		

	}

}
