package Arrays;

import java.util.Scanner;

public class MergingArray {
	
	public static int[] toRead() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=s.nextInt();
		
		int [] a=new int [size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter Element No: "+(i+1));
			a[i]=s.nextInt();
		}
		return a;
	}
	
	static void toDisplay(int [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	
	static int[] toMerge(int[] a, int[] b) {
		int[] c=new int [a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[] a = toRead();
		toDisplay(a);
	}

}
