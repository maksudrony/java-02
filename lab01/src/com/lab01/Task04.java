
 /* PROBLEM 4) Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
   *
  **
 ***
****
 */
package com.lab01;

public class Task04 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int a = i; a < n; a++) {
				System.out.print(" ");
			}

			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {// extra for understanding
			for (int a = 1; a <= i; a++) {
				System.out.print(" ");
			}

			for (int x = i; x < n; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
