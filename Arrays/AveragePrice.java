package Arrays;

public class AveragePrice {

	public static void main(String[] args) {
		int[] a= {10,20,20,10};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		int avg=sum/a.length;
		
		System.out.println(avg);
	}

}
