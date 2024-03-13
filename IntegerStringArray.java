package com.Strings;

public class IntegerStringArray {

	public static void main(String[] args) {
		String[] a= {"3","30","34","5","9"};//9534330
		int size=a.length;
		
		String b="";
		
		for(int i=size-1;i>=size-3;i--)
		{
			b=b+a[i];
		}
		System.out.print(b);
		for(int i=0;i<=1;i++)
		{
			System.out.print(a[i]);
		}
		
  
	}

}
