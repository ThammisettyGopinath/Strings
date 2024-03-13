package com.Strings;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String a=sc.nextLine();
		
		 char[] ch=a.toCharArray();
		 
		String b="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				b=b+ch[i];
			}
		}
		System.out.println(b);
		sc.close();
	}

}
