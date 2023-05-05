//Create Methods for reading, Creating, writing and ZigZaging Elements.

package Arrays;

public class ZigZagMain {

	public static void main(String[] args) {
		int [] a= {10,30,50,70,90};
		int [] b= {20,40,60,80,100,120,140,160};
		int[] c= new int[a.length+b.length];
		
		int i=0;
		int j=0;
		
		while(i<a.length && i<b.length) {
			c[j]=a[i];
			j++;
			
			c[j]=b[i];
			i++;
			j++;
		}
		
		while(i<a.length) {
			c[j]=a[i];
			i++;
			j++;
		}
		
		while(i<b.length) {
			c[j]=b[i];
			i++;
			j++;
		}
		
		for(int ik=0;ik<c.length;ik++) {
			System.out.println(c[ik]);
		}
	}

}
