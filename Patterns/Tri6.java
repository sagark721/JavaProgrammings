/*       1
 *     2 1 2
 *   3 2 1 2 3
 * 4 3 2 1 2 3 4
 */

package Patterns;

public class Tri6 {

	public static void main(String[] args) {
		int a=1;
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=n-1;j++) {
			System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j<i) {
					System.out.print(a-- +" ");
				}
				else {
					System.out.print(a++ +" ");
				}
				System.out.println();
			}
		}
	}

}
