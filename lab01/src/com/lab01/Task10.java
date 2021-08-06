/*PROBLEM 10) Hollow  Triangle – Isosceles using solution of PROBLEM 5) Triangle - Isosceles
Draw triangle of given height
Sample input 1:
3
Sample output 1:
  *
 * *
*****

Sample input 2:
4
Sample output 2:
   *
  * *
 *   *
*******
*/
package com.lab01;

public class Task10 {
	public static void main(String[] args) {
		Star star = new Star();
		 int n = 3;
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int a = 1; a <= 2 * i - 1; a++) {
				if (i == 1 || a == 1 || a == n || i == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}
}

class Star {
	Star(){
		int n=4;
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int a = 1; a <= 2 * i -1; a++) {
				if (i == 1 || a == 1 || i==n || a==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}
}

