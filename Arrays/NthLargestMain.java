package Arrays;

public class NthLargestMain {
	
	public static void main(String[] args) {
		int[] a= {1000,10,10000,100,1};
		int n=4;
		
		int num=0;
		
		//1,10,100,1000,10000
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[i]) {
					count++;
				}
			}
			
			if(count==n-1) {
				num=a[i];
				
			}
			
			
		}
		
		System.out.println(num);
		
		
	}

}
