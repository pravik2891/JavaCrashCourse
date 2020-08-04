package com.lao.String;
public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Pravin Kumar";
		int age = 28;
		
		char charat = name.charAt(2);
		System.out.println(charat);
		
		name.length();
		System.out.println(name.length());
		
		name.compareTo("Pravin");
		System.out.println("Pravin");
		
		name.compareToIgnoreCase("KUMAR");
		System.out.println(name.compareToIgnoreCase("KUMAR"));
		
		name.concat(" Elumalai");
		System.out.println(name.concat(" Elumalai"));
		
		name.contains("avin");
		System.out.println(name.contains("avin"));
		
		name.toLowerCase();
		System.out.println(	name.toLowerCase());
		
		String Priya = "i love you";
		Priya.join("*", "i","love","you");
		System.out.println(Priya.join("*", "i","love","you"));
		
		String dob = "28/06/1991";
		String[] split = dob.split("/");
		for (String newstring : split) {
			System.out.println(newstring);
			
		}
		

	}

}
