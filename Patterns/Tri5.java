/*  
 *     1
 *    121
 *   12321
 *  1234321
 * 123454321
 * 
 * 
 */

package Patterns;

public class Tri5 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int a=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
	
			for(int j=1;j<=2*i-1;j++) {
				if(j<i) {
					System.out.print(a++);
				}
				else
				System.out.print(a--);
			}
		System.out.println();

	}
	

}
}
