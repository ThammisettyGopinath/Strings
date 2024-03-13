package com.Strings;

import java.util.Scanner;

public class NonRepeated {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String a=sc.nextLine();
		
		char[] ch=a.toCharArray();
		  
		
		int count;
		 for(int i=0;i<ch.length;i++)
		 {
			 count=0;
			 for(int j=0;j<ch.length;j++)
			 {
				 if(ch[i]==ch[j])
				 {
					 count++;
					 
				 }
			 
			 }
			 if(count==2)
			 {
				 System.out.print(ch[i]+ " ");
			 }
		 }
		 sc.close();
		 
		 
		 
				

	}

}
