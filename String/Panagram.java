package String;

public class Panagram {

	public static void main(String[] args) {
		String s1="MotherInLaw";
		
		
		
			
			char[] ch1=new char[s1.length()];
			
			
			for(int i=0;i<s1.length();i++) {
				ch1[i]=s1.charAt(i);
				
			}
			
			
			for(int i=0;i<ch1.length;i++) 
			{
				if(ch1[i]>'A' && ch1[i]<'Z') 
				{
					char chh =(char) (ch1[i]+32);
					ch1[i]=chh;
				}
					
				
				
			}
			
			
			int [] a=new int[26];
			
			for(int i=0;i<a.length;i++) {
				if (ch1[i]>='a' && ch1[i]<='z')
				{
					a[ch1[i]-97]++;
				}
			}
			
			
			for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			}		
			
			
			/*
			for(int i=0;i<ch1.length-1;i++) {
				for(int j=0;j<ch1.length-1-i;j++) {
					if(ch1[j]>ch1[j+1]) {
						char temp=ch1[j];
						ch1[j]=ch1[j+1];
						ch1[j+1]=temp;
					}
				}
			}
			*/
			
			
						
			
			
			
			
			
			
			
			
			
			
		

	}

}
