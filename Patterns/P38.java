package Patterns;

public class P38 {
	public static void main(String[] args) {
	
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==j && i<3)|| (i+j==4 && i<2) || (j==2 && i>2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
				
	}

}
