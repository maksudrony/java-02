package com.lab01;
/*PROBLEM 14) Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
1
12
123
1234

*/
public class Task14 {
public static void main(String[] args) {
	int n=4;
	for(int i=1; i<=n; i++) {
		for(int k=1; k<=i;k++ ) {
			System.out.print(k);
		}
		System.out.println();
	}
}
}
