/*
 * WAJP to find the odd element in the array
 */


package Arrays;

public class P5 {

	public static void main(String[] args) {
		int [] a= {100,25,3,65,26,56,26,54,54,4,54,54,54,6,56,56,8,86,56,56,54,65,45,53654,35,4,3544};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
