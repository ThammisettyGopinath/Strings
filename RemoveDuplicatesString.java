package com.Strings;


import java.util.Scanner;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		System.out.println("Enter String : ");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		String newstr="";
		
		
		for(int i=0;i<str.length();i++)
		{
			String ch=""+str.charAt(i);
			if(newstr.contains(ch))
			{
				continue;
			}
			newstr=newstr+ch;
		}
			System.out.print(newstr+" ");
		sc.close();

	}

}
