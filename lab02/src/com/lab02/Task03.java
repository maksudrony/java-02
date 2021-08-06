package com.lab02;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a[]= new int[10];
		for (int i = 0; i <a.length; i++) {
			a[i] = sc.nextInt();
			}
		for(int k=a.length-1; k>=0;k--){
			System.out.println(a[k]);
		}
	}
}
