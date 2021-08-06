package com.lab01;
/* 
 PROBLEM 6) Rhombus using PROBLEM 5) Triangle - Isosceles
Just draw the image of the above triangle once.  And then, the opposite, once.
Sample input:
3
Sample output
  *
 ***
*****
 ***
  *

 */

public class Task06 {
	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= n; i++) {
			for (int a = i; a < n; a++) {
				System.out.print(" ");
			}

			for (int x = 1; x <= 2 * i - 1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= n - i; j++)

			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++)

			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}