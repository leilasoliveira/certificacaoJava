package com.ocajexam.tutorial;

import com.ocajexam.tutorial.Describable;

public class Goat implements Describable{
	
	private String description;
	
	public Goat(String name){
		description = "A goat named " + name;
	}
	
	public String getDescription(){
		return description;
	}
	
	/*
     * Implementa outros métodos relacionados a um bode
	 */
	
}