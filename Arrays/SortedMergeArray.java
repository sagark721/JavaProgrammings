package Arrays;

public class SortedMergeArray {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50};
		int [] b= {1,15,25,35};

		int i=0;
		int j=0;
		int k=0;


		int[] c=new int[a.length+b.length];

		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i++];
			}
			else {
				c[k]=b[j++];
				}
				k++;
			

		}

		while(i<a.length) {
			c[k++]=a[i++];
		}

		while(j<b.length) {
			c[k++]=b[j++];
		}

		for(int l=0;l<c.length;l++) {
			System.out.println(c[l]);
		}
	}

}
