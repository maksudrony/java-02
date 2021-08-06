package com.lab01;

public class Task16 {
public static void main(String[] args) {
	int n=4;
	for(int i=1; i<=n; i++) {
		for(int k=i; k<n;k++) {
			System.out.print(" ");
		}
				for(int j=1;j<=i; j++) { 
			System.out.print(j);
		}
		System.out.println();
	}
}
}
