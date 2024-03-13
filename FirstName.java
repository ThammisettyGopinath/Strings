package com.Strings;

import java.util.Scanner;

public class FirstName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name : ");
		String a=sc.nextLine();
		
		char[] ch=a.toCharArray();
		
		System.out.println("Enter Second name : ");
		String b=sc.nextLine();
		
		System.out.print(b+ ".");
		 
		for(int i=0;i<ch.length;)
		{
			System.out.print(ch[i]);
			break;
		}
		sc.close();
		

	}

}
