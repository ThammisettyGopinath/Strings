package com.Strings;

import java.util.Scanner;

public class RepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		 String a=sc.nextLine();
		 
		 char[] ch=a.toCharArray();
		  
		 
		 int count;
		 for(int i=0;i<ch.length;i++)
		 {
			 count=1;
			 for(int j=i+1;j<ch.length;j++)
			 {
				 if(ch[i]==ch[j] && ch[i]!=' ')
				 {
					 count++;
					 ch[j]='0';
					 
				 }
			 
			 }
			 if(count>1 && ch[i]!='0')
			 {
				 System.out.print(ch[i]+ " ");
			 }
		 }
		 sc.close();
		 
		 
		 
	} 

}
