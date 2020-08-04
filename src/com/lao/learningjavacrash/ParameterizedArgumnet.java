package com.lao.learningjavacrash;

public class ParameterizedArgumnet {
	
	String Animal_name;
	Integer Animal_number;
	
	
	public ParameterizedArgumnet(String name,Integer number) {
		Animal_name = name;
		Animal_number = number;
		
			
		// TODO Auto-generated constructor stub
	}
	void getaniamldetails() {
		System.out.println("The name of he animal is " +Animal_name + "and number is " +Animal_number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedArgumnet details = new ParameterizedArgumnet("lion", 1);
		details.getaniamldetails();

	}

}
