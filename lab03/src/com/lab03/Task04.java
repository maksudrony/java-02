package com.lab03;

import java.util.Scanner;

public class Task04 {
public static void main(String[] args) {
	Task04 ts= new Task04();
	String m="bangladesh";
	int i;
	int a[]= new int[m.length()];
	
	for(i=0; i< m.length(); i++) {
		//int count;
		int codeforch= m.codePointAt(i);
		a[codeforch]++;
		
	}
	for( int j=65; j< a.length; j++) {
		char ch= (char) j;
		System.out.println(ch +"which is"+ j + "which was found" + a[j] + "times" );
	}
	
}
}
