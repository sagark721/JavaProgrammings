package String;

public class ReverseString3 {

	public static void main(String[] args) {

		String s1="India is Great!";

		int words=0;
		
		

		char [] ch=s1.toCharArray();

		for(int i=0;i<ch.length;i++) {

			if((i==0 && ch[i]!=' ') || (ch[i]!=' ' && ch[i-1]==' ')) {
				words++;
			}
		}
		
		String [] wordss=new String[words];
		
		for(int i=wordss.length-1;i>=0;i--) {
			 System.out.print(wordss[i]+" ");
		 }
		
	}

}
