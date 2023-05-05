package Basic;

public class FibonacciNumber {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
		
		while(sum<=20)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}

}
