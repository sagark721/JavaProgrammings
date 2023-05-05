package Patterns;

public class P6 {

	public static void main(String[] args) {
		//char ch='a';
		for(int g=0;g<5;g++)
		{
			char ch='a';
			for(int h=0;h<5;h++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		System.out.println("---------");
		for(int g=0;g<5;g++)
		{
			for(int h=0;h<5;h++)
			{
				System.out.print((char)(h+97)+" ");

			}
			System.out.println();
		}
	}

}
