/*PROBLEM 5) Triangle - Isosceles
Draw triangle of given height
Sample input 1:
3
Sample output 1:
  *
 ***
*****

Sample input 2:
4
Sample output 2:
   *
  ***
 *****
*******
 */
package com.lab01;

public class Task05 {
public static void main(String[] args) {
	
	int n = 3;
	for( int i=1; i<=n; i++) {
		for (int a = i; a < n; a++) {
			System.out.print(" ");
		}

		for (int x = 1; x <= 2*i-1; x++) {
			System.out.print("*");
		}
		System.out.println();
	}
	int m = 4;
	for( int i=1; i<=m; i++) {
		for (int a = i; a < m; a++) {
			System.out.print(" ");
		}

		for (int x = 1; x <= 2*i-1; x++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
