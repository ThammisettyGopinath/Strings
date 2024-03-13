package com.Strings;

import java.util.Scanner;

public class StringSentenceEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String a=sc.nextLine();
		
		String[] words=a.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			if(i%2==0)
			{
				String word=words[i];
				String rev="";
				for(int j=word.length()-1;j>=0;j--)
				{
					rev=rev+word.charAt(j);
					//System.out.println();
				}
				System.out.print(rev+ " ");
			}
			else
			{
				System.out.print(words[i].toUpperCase()+ " ");
			}
				
		}
		sc.close();

	}

}
