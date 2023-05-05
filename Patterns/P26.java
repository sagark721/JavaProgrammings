/*
 *  1 a 1 a
 *  2 b 2 b
 *  3 c 3 c
 *  4 d 4 d
 *  
 */

package Patterns;

public class P26 {

	public static void main(String[] args) {
		int a=1;
		char ch='a';
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(j%2==0) {
					System.out.print(a);
				}
				else
				{
					System.out.print(ch);
				}
			}
			a++;
			ch++;
			System.out.println();
		}
	}

}
