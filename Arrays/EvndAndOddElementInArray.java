/*
 * Design a method to return the number of even number and odd numbers present in a given array
 * 
 * 
 */

package Arrays;
public class EvndAndOddElementInArray {

	static int[] evenOdd(int[] a) {
		int even=0;
		int odd=0;
		int[] b=new int[2];
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		b[0]=even;
		b[1]=odd;
		return b;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int [] a= {10,25,30,40,15,44,25};
		int[]c=evenOdd(a);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
	}

}
