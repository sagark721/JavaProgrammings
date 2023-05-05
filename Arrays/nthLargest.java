/*
 * Design a method to find the nth biggest element inside the given int array
 */

package Arrays;

public class nthLargest {
	

	public static void main(String[] args) {
		int [] a= {10,20,50,20,10,30,80};
		int loc=5;
		
	
		
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		
		int[] b= new int[a.length];
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(!(a[i]==b[j])) {
					b[i]=a[i];
				}
			}
		}
		
		
		
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;");
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
	}

}
