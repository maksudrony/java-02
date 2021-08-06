package com.lab01;
/*
 PROBLEM 7) Hollow Rectangle using solution of PROBLEM 2) Rectangle 
Display a rectangle of given length and width. 
Sample input:
4
5
Sample output
*****
*   *
*   *
*****
 */
public class Task07 {
public static void main(String[] args) {
	int n=4, m=5;
	for(int i=1; i<=n; i++) {
		for(int a=1; a<=m; a++) {
		if(i==1|| i==n || a==m || a==1) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}

	}
		System.out.println();
	}
}
}
