package com.lab01;
/*PROBLEM 8) Hollow Triangle - Left Justified using solution of PROBLEM 3) Triangle - Left Justified
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
public class Task08 {
	public static void main(String[] args) {
		Task08 task = new Task08();
		task.star();

	}

	public void star() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
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
