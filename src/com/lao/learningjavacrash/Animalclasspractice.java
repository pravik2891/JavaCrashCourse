package com.lao.learningjavacrash;

public class Animalclasspractice {
	//parameterized constructor
	String species_name;
	int species_age;
	
	Animalclasspractice(String name,int age){
		species_name= name;
		species_age= age;
	}
	public void getspeciesinfo() {
		System.out.println("The species name is " + species_name + " and species age is " + species_age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animalclasspractice info = new Animalclasspractice("pravin", 29);
		info.getspeciesinfo();

	}

}
