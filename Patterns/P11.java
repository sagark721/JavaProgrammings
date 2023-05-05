/*
 * 1 a 2 b
 * 3 c 4 d
 * 5 e 6 f
 * 7 g 8 h
 */
package Patterns;

public class P11 {

	public static void main(String[] args) {
		int a=1;
		char ch='a';
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(j%2==0)
				{
					System.out.print(a++ +" ");
				}
				else 
				{
				System.out.print(ch++ +" ");
				}
		}
			System.out.println();
	}

	}
}
