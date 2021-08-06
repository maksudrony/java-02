package com.lab02;

import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];

		int i;
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			if (i % 2 == 0)
				System.out.println(a[i]);

		}
	}

}
