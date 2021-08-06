package com.lab03;

public class Task03 {
	public static void main(String[] args) {
		String n= "programming";
		String m= "hunger";
		for(int i=0; i< n.length(); i++) {
			char ch=n.charAt(i);
			int codeforch=(int) ch;
			System.out.println(ch + " : " +codeforch);
		}
		System.out.println();
		for(int k=0; k< m.length(); k++) {
			char ch=m.charAt(k);
			int codeForCh= (int) ch;
			System.out.println(ch +" : "+codeForCh);
		}
	}
}
