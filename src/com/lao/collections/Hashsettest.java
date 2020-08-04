package com.lao.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsettest {
	
	public void hashset() {
		
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet<String> hash = new HashSet<String>();
		
		hash.add("a");
		hash.add("b");
		hash.add("c");
		hash.add("d");
		hash.add("e");
		hash.add(null);
		System.out.println(hash);
		
HashSet<String> copyhash = new HashSet<String>();
		
copyhash.add("a");
copyhash.add("b");
copyhash.add("c");
copyhash.add("d");
copyhash.add("e");
copyhash.add(null);
		System.out.println(copyhash);
		
		Iterator<String>Iter = copyhash.iterator();
		while (Iter.hasNext()) {
			System.out.println(Iter.next());
			
		}
		
		
			
		}
		
		
		
		
		
		
		
		

	}


