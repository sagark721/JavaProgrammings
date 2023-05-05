package Arrays;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int [] a= {10,5,3,5,2,1,1,22,2,2,0,3,2,4,5,5,5,232,53,354,35,1,31,531,35,51,3,1,35,135,1,53,1,531,351};
		int small=a[0];
		for(int i=1;i<a.length;i++) {
			if(small>a[i]) {
				small=a[i];
			}
		}
		System.out.println(small);
	}

}
