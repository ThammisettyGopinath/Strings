package com.Strings;


import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		//counting the word with spaces
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String s1=sc.nextLine();
        char[] a=s1.toCharArray();
        int count=0;
        for(int i=0;i<a.length;i++)
        {
        	
        	count++;
        }
        System.out.println(count);
        sc.close();
		
		
		
		//counting the word without spaces
		
//		Scanner sc=new Scanner(System.in);
//        System.out.println("Enter String : ");
//        String s1=sc.nextLine();
//        char[] a=s1.toCharArray();
//        int count=0;
//        for(int i=0;i<a.length;i++)
//        {
//        	if(a[i]!=' ')
//        	{
//        		count++;
//        	}
//        	
//        }
//        System.out.println(count);
        sc.close();
	}

}
