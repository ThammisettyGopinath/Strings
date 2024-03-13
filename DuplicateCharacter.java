package com.Strings;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String a=sc.nextLine();
		
		char[] ch1=a.toCharArray();
		 
		
//	    System.out.println("tergrt operator : ");
//	    String b=sc.nextLine();
//	    
	    
	    
		int count=0;
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=i+1;j<ch1.length;j++)
				
			{
				if((ch1[i]==ch1[j]) && (ch1[i]!=' '))
				{
					System.out.println(ch1[i] +" ");
					count++;
					break;
				}
				
			}
		}
		System.out.println("count : " +count);
		sc.close();

	}

}
