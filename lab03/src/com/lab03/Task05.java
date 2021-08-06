package com.lab03;

import java.util.Scanner;

public class Task05 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//String m= sc.nextLine();
	String m= "programming";
	for(int i=0; i<3; i++) {
		if (i==1)
		System.out.println(m + "==THE END==");
		else
			System.out.println(m);
	}
}
}
