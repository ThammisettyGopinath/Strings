package com.Strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter String : ");
		String a=sc.nextLine();
		
		char[] ch=a.toCharArray();
		
		int size=ch.length;
		
		for (int i=size-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		sc.close();
	}

}
