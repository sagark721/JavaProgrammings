package Basic;

public class HappyNumber {

	public static boolean isHappy(int num) {
		//int num=45;
		while(num>9)
		{
			int sum=0;
			while(num!=0)
			{
				int rem=num%10;
				sum=sum+(rem*rem);
				num=num/10;
				
			}
			num=sum;
		}
		return num==1 || num==7;
		
	}
	
	public static void main(String[] args)
	{
		
	}
	

}

