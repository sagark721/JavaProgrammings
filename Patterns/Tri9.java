/*
 * 			1
 * 		   2 3
 *  	  4   5
 *  	 6789123
 *  */


package Patterns;

public class Tri9 {

	public static void main(String[] args) {
		int n=25;
		int a=1;
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(a>9) {
					a=1;
				}
				if(i+j==n || i==n-1) {
					System.out.print(a++ +" ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(a>9) {
					a=1;
				}
				if(i==j || i==n-1) {
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
