package com.ocajexam.tutorial;

import com.ocajexam.tutorial.*;

public class Tester{
	
	public static void main(String [] args){
		new Tester();
	}
	
	public Tester(){
		Goat goat = new Goat("Bob");
		GoatShelter goatShelter = new GoatShelter(4, 4, 6);
		System.out.println(description(goat));
		System.out.println(description(goatShelter));
	}
	
	public String description(Describable d){
		return d.getDescription();
	}
}