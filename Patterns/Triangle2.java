/*
 *             1
 *           2 3 4
 *        5 6 7 8 9
 *    10 11 12 13 14 15 16
 * 17 18 19 20 21 22 23 24 25
 * 
 * 
 * 
 */


package Patterns;

public class Triangle2 {

	public static void main(String[] args) {
		//1-1,2-3,3-5,4-7,5-9,
		int n=5;
		int rows=(n*2)-1;

		for(int i=1;i<n-1;i++) {
			for(int j=0;j<rows;j++)
				if(j<=(i*2)-1) {
					if(j>=((i*2)-1) || j<=((i*2)+1)) {
					System.out.print("*");}
				else {
					System.out.print(" ");
				}
					}
			System.out.println();
		}
	}
}



//under age exception
//threads
//achieve data hiding
