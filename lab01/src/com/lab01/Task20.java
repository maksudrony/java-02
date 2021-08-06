package com.lab01;
/*PROBLEM 20) Hollow Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
5
Sample output
1
12
1 3
1  4
12345
*/
public class Task20 {
public static void main(String[] args) {
	
	int n = 5;
	for (int i = 1; i <= n; i++) {
		for (int a = 1; a <= i; a++) {
			if (i == 1 || i == n || a == 1 || a == i) {
				System.out.print(a);
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
