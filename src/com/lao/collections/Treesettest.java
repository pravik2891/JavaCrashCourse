package com.lao.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesettest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(1);numbers.add(1000);numbers.add(100);numbers.add(10);numbers.add(2);
		
		System.out.println(numbers);
		
		Iterator<Integer> descendingiter = numbers.descendingIterator();
		while(descendingiter.hasNext()) {
			System.out.println(descendingiter.next());
		}
		
		numbers.first();
		System.out.println(numbers.first());

		numbers.pollLast();
		System.out.println(numbers.pollLast());
		System.out.println(numbers);
		
		numbers.floor(1);
		System.out.println(numbers.floor(1));
		System.out.println(numbers);
		
		
	}

}
