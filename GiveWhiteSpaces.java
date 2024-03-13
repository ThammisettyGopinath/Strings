package com.Strings;

import java.util.Scanner;

public class GiveWhiteSpaces {

	public static void main(String[] args) {
		System.out.println("Enter string : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		 
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		//Remove white Spaces
		
		
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)!=' ')
//			{
//				s1+=s.charAt(i);
//			}
//		}
//		System.out.println(s1);
//		

	}

}
