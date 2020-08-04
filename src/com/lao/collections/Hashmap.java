package com.lao.collections;

import java.util.HashMap;

public class Hashmap {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> rank = new HashMap<String,Integer>();
		
		rank.put("Pravin", 30);rank.put("pintu", 20);rank.put("joe", 10);rank.put("rajnith", 15);rank.put("kumar", 11);

		System.out.println(rank);
		
		HashMap<String, Integer> copyrank = new HashMap<String,Integer>();
	     copyrank.putAll(rank);
	     System.out.println(copyrank);
	     
	     copyrank.keySet();
	     System.out.println(copyrank.keySet());
	     
	     copyrank.values();
	     System.out.println(copyrank.values());
	     
	     rank.replace("Pravin", 30);
	     System.out.println(rank.replace("Pravin", 30));
	     System.out.println(rank);
	}

}
