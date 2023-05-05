/*
 * 1234
 * 5678
 * 9123
 * 4567
 * 
 */
package Patterns;
public class P13 {

	public static void main(String[] args) {
		int a=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(a>9)
				{
					a=1;
					System.out.print(a++);
				}
				else
				{
					System.out.print(a++);
				}
				/*if(a<=9) {
					System.out.print(a++);
				}
				else {
					System.out.println(a=1);
					System.out.print(a++);
				}*/
			}
			System.out.println();
		}
	}

}
