/*
 * abcd
 * 1234
 * $$$$
 * 1234
 * abcd
 */
package Patterns;

public class P15 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			char a='a';
			int b=1;
			int count=1;

			for(int j=0;j<4;j++) {
				System.out.print(a++);
				count++;

			}
			if (count==5)
			{
				System.out.print(a++);
				count++;
			}
			System.out.println();
			System.out.println("Count= "+count);

		}

		

	}
}


