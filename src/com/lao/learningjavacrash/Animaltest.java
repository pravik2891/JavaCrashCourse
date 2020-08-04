package com.lao.learningjavacrash;
//parameterized constructor//
public class Animaltest {
	
	String animal_name;
	String animal_type;

	
	Animaltest(String name,String type){
		animal_name=name;
		animal_type=type;
		
		
	}
	public void getanimalinfo() {
		System.out.println("Animal name is " +animal_name + " and animal type is " + animal_type);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animaltest animalinfo = new Animaltest("giraffe", "herbivores");
		animalinfo.getanimalinfo();

	}

}
