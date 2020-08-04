package com.lao.learningjavacrash;

public class Defaultconstructors {
	
	String student_name;
	Integer roll_no;
	
	public void getstudentdetails() {
		System.out.println("student detail is " + student_name + roll_no);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Defaultconstructors studetails = new Defaultconstructors();
		studetails.getstudentdetails();

	}

}
