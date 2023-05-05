/*
 * WAJP to design a method to count no. of prime numbers present in a given array
 */

package Arrays;

public class PrimesInArray {

	public static void main(String[] args) {
		
		int a[]= {10,2,5,12,3,68,36,45};
		int primes=0;
		
		for(int i=2;i<a.length/2;i++) {
			
				if(!(a[i]%a[i]==0)) {
					primes++;
				}
			
		}
		System.out.println(primes);
	}

}


