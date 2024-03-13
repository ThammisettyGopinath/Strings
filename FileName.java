package com.Strings;

import java.util.Scanner;

public class FileName {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter File Name : ");
		String a=sc.nextLine();
		
		String[] b=a.split("\\.");
		
		
		
		for(int i=b.length-1;i>0;i--)
		{
			System.out.println("."+b[i]);
		}
		sc.close();
	}

}
