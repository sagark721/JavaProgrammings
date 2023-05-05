/*
 * 
 */
package Basic;

import java.util.Scanner;

public class ArmstrongNumber1 {
	
	static String isArmstrong(int num)
	{
		int temp_num=num;
		int temp_num_1=temp_num;
		int digits=0;
		
		while(num>0)
		{
			num=num/10;
			digits++;
		}
		
		//System.out.println("Digits: "+digits);
		

		int ld;
		int sum=0;
		while(temp_num>0)
		{
			ld=temp_num%10;	
			//System.out.println("ld"+ld);
			int prod=1;
			int power=digits;
			while(power>=1)
			{
				prod=prod*ld;
				power--;
			}
			//System.out.println("Product: "+prod);
			sum=sum+prod;
			temp_num=temp_num/10;
		}
		//System.out.println(sum);
		
		if (sum==temp_num_1)
			return "Number is Armstrong";
		else
			return "Number is not a Armstrong";
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.println("Enter Number");
		//int num=s.nextInt();
		
		//isArmstrong(num);
		
		for (int i=0;i<2000;i++)
		{
			if(isArmstrong(i).equals("Number is Armstrong"))
				System.out.println(i);
		}
		

	}

}


/*
int power=3;
int prod=1;
int numm=3;

while(power>1)
{
	prod=prod*numm;
	power--;
}

System.out.println(prod);
*/
