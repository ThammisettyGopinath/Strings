package com.Strings;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String a=sc.nextLine();
		
		System.err.println(a.replace("a", "b"));
		sc.close();
	}

}
