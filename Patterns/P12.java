/*
 * aaaa
 * bbbb
 * cccc
 * dddd
 */

package Patterns;

public class P12 {

	public static void main(String[] args) {
		char ch='a';
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	}

}
