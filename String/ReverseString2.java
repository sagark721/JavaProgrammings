package String;

public class ReverseString2 {

	public static void main(String[] args) {

		 String s1="India is Great";
		 
		 String[] str=s1.split(" ");
		 
		 for(int i=str.length-1;i>=0;i--) {
			 System.out.print(str[i]+" ");
		 }
	}

}
