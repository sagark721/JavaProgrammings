package String;

public class StringIntoLowerCase {

	public static void main(String[] args) {
		String s="India Is Great 123";
		String s2="";
		int sum=0;
		
		
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				ch[i]=(char)(ch[i]+32);
			}
			System.out.println(ch);
		}
		
		
		/*
		
		=========== OR ===========
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=92) {
				sum=ch+32;
				s2=s2+(char) sum;
				
			}
			else {
				s2=s2+ch;
			}
			
		}
		
		*/
		
		
		System.out.println(s2);
	}

}
