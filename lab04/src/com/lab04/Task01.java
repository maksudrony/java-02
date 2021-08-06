package com.lab04;

public class Task01 {
	public static void main(String[] args) {
		Test test=new Test();
		test.methodA();
		test.methodB();
	}
}
class Test{
int sum;
public  int y;
public void methodA(){
int x=0, y =0;
    y = y + 7;
    x = y + 11;
sum = x + y;
System.out.println(x + " " + y+ " " + sum);
  }
public void methodB(){
int x = 0;
    y = y + 11;
    x = x + 33 + y;
sum = sum + x + y;
System.out.println(x + " " + y+ " " + sum);
  }
}

	
	
