package com.lao.String;

import com.learn.poly.Myself;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Pravin Kumar";		
		text.concat("Elumalai");
		System.out.println(text.concat("Elumalai"));
		System.out.println(text);
		StringBuffer newtext = new StringBuffer("Pravin Kumar");
		System.out.println(newtext.append("Elumalai"));
		System.out.println(newtext);
		
		
		
		StringBuffer game = new StringBuffer("SmackDown");
		System.out.println(game.reverse());
		
		StringBuffer anime = new StringBuffer("Tsubasha");
	
		anime.replace(0, 4, "XXX");
		System.out.println(anime.replace(0, 4, "XXX"));
		
		StringBuffer king = new StringBuffer("TroyEllis");
		king.delete(2, 4);
		System.out.println(king.delete(2, 4));
		
		StringBuffer name = new StringBuffer("Pra");
		System.out.println(name.insert(3, "vin"));
		
		

	}

}
