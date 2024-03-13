package com.Strings;

import java.util.Scanner;

public class EvenWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		String a=sc.nextLine();
		String[] words=a.split(" ");

		for(int i=0;i<words.length;i++)
		{
			if(i%2==0)		
			{
				System.out.print(words[i] + " ");
			}
		}
		sc.close();



	}

}
