package com.lab02;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		int a[] = new int[15];
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] < 10)
				System.out.println(a[i]);

			else {
				System.out.println("the range should be 0-9");
				i--;
			}
			continue;

		}
		int count=0;
		for(int k=0; k< a.length; k++) {
			if (a[i]==a[k]) {
				count++;
              
		}
		

	}
}
}
