package com.learn.poly;
//method overloading
public class Addition {
	
	public int add(int a, int b) {
		return a+b;
	}
	public Integer add(int a, int b, int c) {
		return a+b+c;
	}
	public float add(float d,float e) {
		return d+ e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition addition= new Addition();
		System.out.println("add 2 numbers " +addition.add(20, 30));
		System.out.println("add 3 numbers " +addition.add(20,25, 30));
		System.out.println("add 2 float " +addition.add(50, 50));
		

	}

}
