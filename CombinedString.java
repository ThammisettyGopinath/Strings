package com.Strings;

import java.util.Scanner;

public class CombinedString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String a=sc.nextLine();
		
		char[] ch=a.toCharArray();
		
		int specialCount=0;
		int digitsCount=0;
		int capicalCount=0;
		int smallCount=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>=33) && (ch[i]<=47))
			{
				specialCount++;
			}
			if((ch[i]>=48) && (ch[i]<=57))
			{
				digitsCount++;
			}
			if((ch[i]>=65) && (ch[i]<=90))
			{
				capicalCount++;
			}
			
			if((ch[i]>=97) && (ch[i]<=122))	
			{
				smallCount++;
			}
		}
		System.out.println("capicalCount : "+capicalCount);
		System.out.println("smallsCount : "+smallCount);
		System.out.println("specialCount : "+specialCount);
		System.out.println("digitsCount : "+digitsCount);
		sc.close();

	}

}
