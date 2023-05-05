package Arrays;

public class ZigzagArray {

	public static void main(String[] args) {
		int [] a= {10,30,50,70,90};
		int [] b= {20,40,60,80,100};
		int[] c= new int[a.length+b.length];
		int i=0;
		for(int l=0;l<c.length;l++) {
			
			if((i<a.length || i<b.length) && i<c.length-1) {
			c[i]=a[i];
			i++;
			c[i+1]=b[i];
			}
			
			
			
		}
		for(int ii=0;ii<c.length;ii++) {
			System.out.println(c[ii]);
		}
		
		
		
		
	}

}
