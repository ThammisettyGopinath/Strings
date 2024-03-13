package com.Strings;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String a=sc.nextLine();
		char[] ch1=a.toCharArray();
		
		
		System.out.println("Enter character : ");
		char b=sc.next().charAt(0);
		
		
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(ch1[i]==b)
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
