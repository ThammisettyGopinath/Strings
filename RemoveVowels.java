package com.Strings;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String a=sc.nextLine();

		char[] ch=a.toCharArray();

		
		//Remove vowels and printing consonents only
		

		String b=""; 
//
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u')
//			{
//				b=b+ch[i];
//			}
//		}
//		System.out.println(b);
		
		
		
		//remove consonents and printing vowels only
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				b=b+ch[i];
			}
		}
		System.out.println(b);
		
		sc.close();
	}

}
