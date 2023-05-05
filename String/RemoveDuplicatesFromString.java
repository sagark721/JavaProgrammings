package String;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		String s="!aaa  !bbb   !cc   !ddd    !eee";
		char[] ch=s.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++) {
			boolean isRepeat=false;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					isRepeat=true;
					break;
				}
			}
			if(isRepeat==false) {
				res=res+ch[i];
			}
		}
		
		
		System.out.println(res);
	}

}
