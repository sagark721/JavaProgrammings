/*
 *  a
 *    b
 *      c
 *        d
 * 
 */


package Patterns;

public class P27 {

	public static void main(String[] args) {
		char ch='a';
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
				
			}
			ch++;
			System.out.println();
		}
	}

}
