package com.lao.exceptionhandling;

public class Finallyexception {
	public static int gama(){

		return 5;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("im on");
			System.out.println(Finallyexception.gama());
			
			
			throw new Exception();
		}
		 catch (Exception e) {
			
			System.out.println("im off");
			// TODO: handle exception
		}finally {
			System.out.println("im pissed");
		}
		

	}

}
