package com.Strings;

import java.util.Scanner;

public class WhileRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String a=sc.nextLine();
		
		
		String rev="";
		
		int size=a.length();
		
		int i=size-1;
		
		while(i>=0)
		{
			rev=rev+a.charAt(i);
			i--;
		}
		System.out.println(rev);
		sc.close();

	}

}
