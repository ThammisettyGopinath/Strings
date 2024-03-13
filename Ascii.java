package com.Strings;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string : ");
//		String a=sc.nextLine();
		
		//char[] ch=a.toCharArray();
		
		
		// printing A-Z
		
//		for(char i=65;i<=90;i++)
//		{
//			System.out.print(i+" ");
//		}
		
		
		
		
		//printing a-z
		
		
//		for(char i=97;i<=122;i++)
//		{
//			System.out.print(i + " ");
//		}
		
		
		//printing a B c D....
		
		for(char i=65;i<122;i++)
		{
			if(i%2!=0)
			{
				i+=32;
				System.out.print(i+ " ");
			}
			else
			{
				i-=32;
				System.out.print(i+ " ");
				
			}
		}
		sc.close();
		
		

	}

}
