package com.Strings;

import java.util.Scanner;

public class VowelsReturn {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Name : ");
		String a=sc.nextLine();
		
		char[] ch=a.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u'  && ch[i]!=' ')
				{
				System.out.print(ch[i] + " ");
				}
			
			
		}	
		
		
		sc.close();
		
	}

}
