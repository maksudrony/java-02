package com.lab01;
/*PROBLEM 15) Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
   4
  34
 234
1234
*/
public class Task15 {
	public static void main(String[] args) {

		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int k = i; k < n; k++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
			
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
}
