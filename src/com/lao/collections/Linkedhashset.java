package com.lao.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {
	
	public void linkedhash() {
LinkedHashSet<Integer>linkhash = new LinkedHashSet<Integer>();
		
		linkhash.add(1);
		linkhash.add(2);
		linkhash.add(4);
		linkhash.add(8);
		linkhash.add(8);
		linkhash.add(0);
		
		System.out.println(linkhash);
		System.out.println("------------------------------------------------");
		
		for(int i=0;i<linkhash.size();i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------------");
		
		for (Integer listhash : linkhash) {
			System.out.println(listhash);
			
		}
		System.out.println("------------------------------------------------");
		
		Iterator<Integer>Iter = linkhash.iterator();
		while (Iter.hasNext()) {
			System.out.println(Iter.next());
			
		
		
		
	}
	}
	public static void main(String[] args) {
		
		Linkedhashset set = new Linkedhashset();
		set.linkedhash();
		
}
				
	
		
		
	}


