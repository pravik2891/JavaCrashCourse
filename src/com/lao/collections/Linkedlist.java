package com.lao.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	
	
	public void linkedlist() {
		
		LinkedList<Integer>list = new LinkedList<Integer>();
		 list.add(0);
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 list.add(4);
		 System.out.println("linkedlist:" + list);
		 
		 int num = 0;
		 while(num>list.size()) {
			 System.out.println(num);
		 }
		 
			 
		 
		 for (Integer newlist : list) {
			 System.out.println(newlist);
			
		 }
		 for(int i=0;i<list.size();i++) {
			 System.out.println(i);
		 }
		 
		 
		 list.add(0, 5);
		 System.out.println(list);
		 
		 list.addFirst(6);
		 System.out.println(list);
		 
		 list.contains(6);
		 System.out.println(list);
		 
		 list.remove(0);
		 System.out.println(list);
		 LinkedList< String> linkedList= new LinkedList<String>();
			linkedList.add("a");
			linkedList.add("b");
			linkedList.add("c");
			linkedList.add("d");
			Iterator<String>iterator = linkedList.iterator();
			System.out.println("Iterator");
			while(iterator.hasNext()){
				System.out.println("Elements in the LL are "+ iterator.next());
		 
		
		 
			}
		
		 
		 
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedlist lklist = new Linkedlist();
		 lklist.linkedlist();

	}

	
	}


