package com.lab01;
/*PROBLEM 11) Hollow  Rhombus using solution of PROBLEM 6) Rhombus 
Just draw the image of the above triangle once. And then, the opposite, once.
Sample input:
3
Sample output
  *
 * *
*   *
 * *
  *
*/
public class Task11 {
	public static void main(String[] args) {

		int n = 3;
		for (int i = 1; i <= n; i++) {
			for (int a = i; a < n; a++) {
				System.out.print(" ");
			}

			for (int x = 1; x <= 2 * i - 1; x++) {
				if(i==1||  x==1|| x==2*i-1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= n - i; j++)

			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++){
				if(j%2==0)
				System.out.print(" ");
				else 
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
