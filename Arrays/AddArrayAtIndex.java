
/*
 * Define a Method to add an array to specified index of the given array 
 **/
package Arrays;

public class AddArrayAtIndex {

	public static void main(String[] args) {

		int []a= {10,20,30,40};
		int []b= {25,26,27};
		int index=2;
		int []c=new int[a.length+b.length];
		int l=0;
		int m=0;
		for(int i=0;i<c.length;i++) {
			if(i<index) {
				c[i]=a[m++];
				/*l++;
				m++;*/
			}
			else if(i==index || l<b.length) {
				c[i]=b[l++];
				}
				
			else {
				c[i]=a[m++];
				
			}
		}

			
		
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}

