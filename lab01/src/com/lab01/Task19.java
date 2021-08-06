package com.lab01;
/*PROBLEM 19) Hollow Rectangle
Display a rectangle of given length and width. 
Sample input:
4
5
Sample output
12345
1   5
1   5
12345
*/
public class Task19 {
public static void main(String[] args) {
	int n=4, m=5;
	for(int i=1; i<=n; i++) {
		for(int a=1; a<=m; a++) {
		if(i==1|| i==n || a==m || a==1) {
			System.out.print(a);
		}
		else {
			System.out.print(" ");
		}

	}
		System.out.println();
	}
}
}
