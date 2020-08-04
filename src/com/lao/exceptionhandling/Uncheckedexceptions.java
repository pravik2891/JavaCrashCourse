package com.lao.exceptionhandling;

public class Uncheckedexceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		try {
			int a=2;
			int b=10;
			int c=b/a;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("wrong prctice");
		}
		catch(NullPointerException e){
			System.out.println("FuckOff");
		}
		catch (Exception e) {
			// TODO: handle exception.
		e.printStackTrace();
		System.out.println("loveYou");
		}

	}

}
