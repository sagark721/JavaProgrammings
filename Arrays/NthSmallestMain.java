package Arrays;

public class NthSmallestMain {

	public static void main(String[] args) {
		int[] a= {100,1,1000,10000,10};
		int n=1;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]<a[i]) {
					count++;
				}
			}
			
			if(count==n-1) {
				System.out.println(a[i]);
			}
		}
	}

}



