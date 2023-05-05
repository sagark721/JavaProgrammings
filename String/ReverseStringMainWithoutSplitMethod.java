package String;

public class ReverseStringMainWithoutSplitMethod {

	public static void main(String[] args) {

		String s1= "India is Great";
		char [] ch=s1.toCharArray();
		
		String newString="";
		
		for(int i=ch.length-1;i>=0;i--) {
			int k=i;
			while(i>=0 && ch[i]!=' ') {
				i--;
			}
			
			int j=i+1;
			
			while(j<=k) {
				newString=newString+ch[j];
				j++;
			}
			
			if(i>=0) {
				newString=newString+ch[i];
			}
		}
		
		System.out.println(newString);
	}

}
