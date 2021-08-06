/*
PROBLEM 3) Triangle - Left Justified 
Draw right angled triangle of given height
Sample input:
4
Sample output
*
**
***
****     */
package com.lab01;

public class Task03 {
public static void main(String[] args) {
	Task03 task= new Task03();
	task.star();
}
public void star() {
	for(int i=1; i<=4; i++) {
		for(int a=1; a<=i; a++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=1; i<=4; i++) {///extra for understanding
		for(int a=i; a<4; a++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}

}
