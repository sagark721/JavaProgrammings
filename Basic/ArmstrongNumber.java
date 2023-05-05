package Basic;

import java.util.Scanner;

public class ArmstrongNumber {
	
	
	static void isArmstrong(int num)
	{
		int temp_num=num;
		int power=0;
		int sum=0;
		int temp_num1=temp_num;
		
		while(num>0)
		{
			num=num/10;
			power++;
			
		}
		
		//System.out.println(power);
		
		
		while(temp_num>0)
		{
			int pnum=1;
			int ld=num%10;
			int count=power;
			
			while(count>0)
			{
				pnum=ld*pnum;
				count--;
			}
			sum=sum+pnum;
			temp_num=temp_num/10;
			
		}
		
		if (sum==temp_num1)
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not a ArmStrong Number");
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num=s.nextInt();
		
		isArmstrong(num);
		
	}

}
