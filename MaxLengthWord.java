package com.Strings;

import java.util.Scanner;

public class MaxLengthWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String a=sc.nextLine();

		String[] words=a.split(" ");
		
		String max=words[0];
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>words[0].length())
			{
				max=words[i];
			}
		}
		System.out.println(max);
		sc.close();
	}

}
