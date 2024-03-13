package com.Strings;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char[] b=a.toCharArray();
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]=='a')
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
