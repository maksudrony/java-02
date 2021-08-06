package com.lab02;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		int a[] = new int[10];
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(i=0; i< a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
