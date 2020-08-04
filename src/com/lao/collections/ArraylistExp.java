package com.lao.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArraylistExp {
	
	
	public void arraylistexp() 	{
		
		List<String>arraylist = new ArrayList<String>();
		arraylist.add("Pravin");
		arraylist.add("joe");
		arraylist.add("ranjith");
		arraylist.add("pintu");
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
			
		}

		ListIterator<String> iteratelist = arraylist.listIterator();
		
		while(iteratelist.hasNext()) {
			System.out.println(iteratelist.next());
		}
		while(iteratelist.hasPrevious()) {
			System.out.println(iteratelist.previous());
		}
		
		for (String string : arraylist) {
			System.out.println(string);
			
		}
		
		System.out.println("list" +arraylist);
		
		arraylist.add(2, "BCOM");
		System.out.println("list" +arraylist); 
		
		arraylist.remove(2);
		System.out.println("list" +arraylist);
		
		arraylist.clear();
		System.out.println("list" +arraylist);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArraylistExp array = new ArraylistExp();
		array.arraylistexp();
		
		
		
		
		
		 
		
			
		
		
		}
		
			
			
		}
		
	

		
		



