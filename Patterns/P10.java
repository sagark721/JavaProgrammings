/*
 * 1 2 3 4
 * a b c d
 * 1 2 3 4
 * a b c d
 */

package Patterns;

public class P10 {

	public static void main(String[] args) {

		for(int i=0;i<4;i++)
		{
			char ch='a';
			int a=1;
			for(int j=0;j<4;j++)
			{
				if(i%2==0)
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
