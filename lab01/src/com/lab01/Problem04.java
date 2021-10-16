package exam;

import java.util.Scanner;

public class Problem04 {
	public static void main(String args[]){
		Problem04 prb04= new Problem04();
		prb04.bank();
 }
	void bank(){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
		System.out.println("Enter the value");
		int n = sc.nextInt();
		
		
			if(n>=500 && n % 500 ==0 && n<=20000) 
				System.out.println("TRANSACTION SUCCESSFUL");
			
			
			else if (n>20000) 
				System.out.println("EXCEEDED AMOUNT");
			
			else 
				System.out.println("INVALID AMOUNT");
			
			
			
		}
		
	}
}
	

