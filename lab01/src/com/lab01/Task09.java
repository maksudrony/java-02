/*
 PROBLEM 9) Hollow Triangle - Right Justified using solution of PROBLEM 4) Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
5
Sample output
    *
   **
  * *
 *  *
*****
 */
package com.lab01;

public class Task09 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			for (int a = 1; a <= i; a++) {
				if (i == 1 || i == n || a == 1 || a == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
