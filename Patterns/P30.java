/*
 *     1 2 3 4 5
 *     6       7
 *     8       9
 *     1 2 3 4 5
 * 
 * 
 * 
 */

package Patterns;

public class P30 {

	public static void main(String[] args) {
	
		int a=1;
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a>9) {
					a=1;
				}
				
				if(i==0 || i==n-1 ) {
					System.out.print(a++ +" ");
				}
				else if( i!=n-1 && j==0) {
					System.out.print(a++ +" ");
				}
				else if(i!=0 && j==n-1) {
					System.out.print(a++ +" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
	
	}
	

}
