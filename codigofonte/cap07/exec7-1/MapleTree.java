package com.ocajexam.tutorial.plants;

import com.ocajexam.tutorial.plants.Plant;

public class MapleTree extends Plant {
	
	private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 2;
	
	/*
	 * Uma árvore cresce em direção ao alto alguns centímetros por ano.
	 * Uma árvore não se recolhe ao nível do solo durante o inverno.
	 */
	
	private void grow() {
		int currentHeight = getHeight();
		setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
	}
	
	public void doSpring() {
		grow();
		addYearToAge();
		System.out.println("Spring: The maple tree is starting to grow " +
			"leaves and new branches");
		System.out.println("\tCurrent Age: " + getAge() + " " +
			"Current Height: " + getHeight());
	}
	
	public void doSummer(){
		grow();
		System.out.println("Summer: The maple tree is continuing to grow");
		System.out.println("\nCurrent Age: " + getAge() + " " +
			"Current Height: " + getHeight());
	}
	
	public void doFall(){
		System.out.println("Fall: The mapple tree has stopped growing" +
			" and is losing its leaves");
		System.out.println("\tCurrent Age: " + getAge() + " " +
			"Current Height: " + getHeight());
	}
	
	public void doWinter() {
		System.out.println("Winter: The mapple tree is dormant");
		System.out.println("\tCurrent Age: " + getAge() + " " +
			"Current Height: " + getHeight());
	}
}