/*
 * WAJP to define a method to delete an element from the specified index of the given array.
 */

package Arrays;

public class RemoveElementAtIndex {
	
	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int[] b=new int[a.length-1];
		int index=3;
		
		for(int i=0;i<b.length;i++) {
			if(i<index) {
				b[i]=a[i];
			}
			else if(i>index) {
				b[i]=a[i+1];
			}
			
			else  {
				b[i]=a[i+1];
				
			}
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

	}

}




