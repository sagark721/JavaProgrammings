package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1="MotherInLaw";
		String s2="HitlerWomen";
		
		if(s1.length()==s2.length()) {
			
			char[] ch1=new char[s1.length()];
			char[] ch2=new char[s2.length()];
			
			for(int i=0;i<s1.length();i++) {
				ch1[i]=s1.charAt(i);
				ch2[i]=s2.charAt(i);
			}
			
			
			for(int i=0;i<ch1.length;i++) 
			{
				if(ch1[i]>'A' && ch1[i]<'Z') 
				{
					char chh =(char) (ch1[i]+32);
					ch1[i]=chh;
				}
				
				if(ch2[i]>'A' && ch2[i]<'Z') 
				{
					char chh =(char) (ch2[i]+32);
					ch2[i]=chh;
				}
				
				
			}
		
			
			
			
			for(int i=0;i<ch1.length-1;i++) {
				for(int j=0;j<ch1.length-1-i;j++) {
					if(ch1[j]>ch1[j+1]) {
						char temp=ch1[j];
						ch1[j]=ch1[j+1];
						ch1[j+1]=temp;
					}
				}
			}
			
			
			for(int i=0;i<ch2.length-1;i++) {
				for(int j=0;j<ch2.length-1-i;j++) {
					if(ch2[j]>ch2[j+1]) {
						char temp=ch2[j];
						ch2[j]=ch2[j+1];
						ch2[j+1]=temp;
					}
				}
			}
			
			
			
			String ss1="";
			String ss2="";
			
			for(int i=0;i<ch1.length;i++) {
				ss1=ss1+ch1[i];
				ss2=ss2+ch2[i];
			}
			
			
			
			if(ss1.equals(ss2)) {
				System.out.println("Strings are Anagram.");
			}
			
			else {
				System.out.println("Strings are not Anagram");
			}
			
			
			
			
		}
	}

}
