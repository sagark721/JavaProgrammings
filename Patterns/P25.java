/*
 *   1 0 1 0 1
 *   0 1 0 1 0
 *   1 0 1 0 1
 *   0 1 0 1 0
 */

package Patterns;

public class P25 {

	public static void main(String[] args) {
		int a=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				if(a==1) {
					System.out.print(a+" ");
					a=0;
				}
				else
				{
					System.out.print(a+" ");
					a=1;
				}
				
			}
			System.out.println();
		}
	}

}
