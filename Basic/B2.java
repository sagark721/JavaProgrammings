package Basic;

import java.util.Scanner;

public class B2
{

	public static void main(String[] args) 
	
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Number to check even or odd");
		int n1=s1.nextInt();
		
		if (n1%2==0)
		{
			System.out.println("Entered number is Even");
		}
		else
			System.out.println("Entered number is Odd");
		
		String s="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		String s11="";
		for (int i=0;i<s.length();i++)
		{
			s11=s11+"%";
		}
		
		System.out.println(s11);
		
		
	}

}
