package com.Strings;


import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence : ");
		String a=sc.nextLine();
		int count=1;
		for(int i=0;i<a.length();i++)
		{
			if((a.charAt(i)==' ') && (a.charAt(i+1)!=' ') )
			{
				count++;
			}
					
		}
		System.out.println(count);
		
		sc.close();
		
	}

}
