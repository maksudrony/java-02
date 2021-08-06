package com.lab01;
/*PROBLEM 17) Triangle - Isosceles
Draw triangle of given height
Sample input 1:
3
Sample output 1:
  1
 123
12345
*/
public class Task17 {
public static void main(String[] args) {
	int n = 3;
	for( int i=1; i<=n; i++) {
		for (int a = i; a < n; a++) {
			System.out.print(" ");
		}

		for (int x = 1; x <= 2*i-1; x++) {
			System.out.print(x);
		}
		System.out.println();
}
}
}
