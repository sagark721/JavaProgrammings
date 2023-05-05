/*
 * WAJP to find the summation of elements at even index
 */

package Arrays;

import java.util.Scanner;

public class P1 {

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
		
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println("Summation of elements at Even index is: "+sum);
		
		for(int i=0;i<a.length;i++);
	}

}
