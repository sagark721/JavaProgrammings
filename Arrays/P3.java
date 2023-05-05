/*
 * WAJP to find the Biggest element present inside an int type array
 */
package Arrays;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=s.nextInt();
		int [] a=new int[size];
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element no. "+(i+1));
			a[i]=s.nextInt();
		}
		int big=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>big) {
				big=a[i];
			}
		}
		System.out.println("Big: "+big);
	}
}
