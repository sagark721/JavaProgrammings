package Basic;

public class FiboUsingRecurssion {
	
	static int fibo2(int num) {
		if(num==1) {
			return 0;
		}
		else if(num==2) {
			return 1;
		}
		else {
			return fibo(num-1)+fibo(num-2);
		}
	}
	
	static void printfibo() {
		int val=50;
		for(int i=1;i<val;i++) {
			System.out.println(fibo(i));
		}
	}

	static int fibo(int num) {
		if (num==1) {
			return 0;}
		else if(num==2) {
			return 1;}
		else
			{
			return fibo(num-1) + fibo(num-2);
			}
	}
	public static void main(String[] args) {
		int a=10;
		for(int i=1;i<=a;i++) {
			//System.out.println(fibo(i)+" ");
		}
		
		printfibo();
	}
}


