package com.Strings;


import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String a=sc.nextLine();
		
		String[] words=a.split(" ");
		//String rev="";
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String rev="";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			System.out.print(rev + " ");
			//reverse=reverse+rev+" ";
		}
		//System.out.println(reverse);
		sc.close();
	}

}
