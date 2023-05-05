/*
 * WAJP to define a method to add an element for the specified index of the given Array.
 */

package Arrays;

public class AddElementInIndex {
	

	public static int[] addVal(int[] a,int index,int val) {
		if(index<0 || index >= a.length) {
			System.out.println("Enter Valid Index");
			return a;
		}


		int[]b=new int [a.length+1];
		for(int i=0;i<b.length;i++) {
			if(i<index) {
				b[i]=a[i];
			}

			else if(i==index) {
				b[i]=val;
			}

			else {
				b[i]=a[i-1];
			}

		}

		return b;


	}

	public static void main(String[] args) {
		int[] a= {10,20,30,40};

		/*int[]b=new int [a.length+1];
		int index=2;
		int val=25;
		for(int i=0;i<b.length;i++) {
			if(i<index) {
				b[i]=a[i];
			}

			else if(i==index) {
				b[i]=val;
			}

			else {
				b[i]=a[i-1];
			}

		}


		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		 */
		int[] b=addVal(a,25,27);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);

		}


	}
}






