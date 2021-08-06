package com.lab03;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String m= sc.nextLine();
		String m= "programming";
		String n="hunger";
		String p="==THE END==";
		for(int i=0; i<3; i++) {
			if (i==1)
			System.out.println(m.concat("==THE END=="));
			else
				System.out.println(m);
		}
		System.out.println();
		for(int k=0; k<3; k++) {
			if(k==1)
				System.out.println(n.concat(p));
			else
				System.out.println(n);
				
		}
	}
}
