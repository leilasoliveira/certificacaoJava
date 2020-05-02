package com.ocajexam.tutorial.plants;

import com.ocajexam.tutorial.plants.MapleTree;
import com.ocajexam.tutorial.plants.Tulip;

public class Simulator{
	
	public static void main(String[] args){
		
		System.out.println("Creating a maple tree and tulip...");
		
		MapleTree mapleTree = new MapleTree();
		Tulip tulip = new Tulip();
		Rose rose = new Rose();
		
		System.out.println("Entering a loop to simulate 3 years");
		
		for(int i = 0; i < 3; i++){
			mapleTree.doSpring();
			tulip.doSpring();
			rose.doSpring();
			mapleTree.doSummer();
			tulip.doSummer();
			tulip.doSummer();
			mapleTree.doFall();
			tulip.doFall();
			rose.doFall();
			mapleTree.doWinter();
			tulip.doWinter();
			rose.doWinter();
		}
		
	}
	
}