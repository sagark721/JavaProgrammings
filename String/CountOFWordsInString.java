/*
 * WAJP To count no. of words present in the given string  
 */

package String;

public class CountOFWordsInString {

	public static void main(String[] args) {
		String s="        Java    is    a     Programming    Language                 ";
		int words=0;
		
		char [] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if((i==0 && ch[i]!=' ') || (ch[i]!=' ' && ch[i-1]==' ')) {
				words++;
			}
		}
		
		System.out.println(words);
	}

}
