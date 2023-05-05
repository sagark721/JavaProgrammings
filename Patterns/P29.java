/*
 *   1 1 1 1 
 *   0 0 0 0
 *   1 1 1 1
 *   0 0 0 0
 * 
 * 
 */
package Patterns;

public class P29 {

	public static void main(String[] args) {
		int a=0;
		for(int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				if(i%2==0) {
					System.out.print(a+1);
				}
				else {
					System.out.print(a);
				}
			}
			System.out.println();
		}
	}

}
