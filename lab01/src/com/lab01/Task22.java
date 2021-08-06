package com.lab01;

public class Task22 {
public static void main(String[] args) {
	int n = 3;
	
	for (int i = 1; i <= n; i++) {
		for (int j = i; j < n; j++) {
			System.out.print(" ");
		}
		for (int a = 1; a <= 2 * i - 1; a++) {
			if (i == 1 || a == 1 || a == n || i == n)
				System.out.print(a);
			else
				System.out.print(" ");
		}

		System.out.println();
	}
}
}
