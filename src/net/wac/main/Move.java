package net.wac.main;

import java.util.ArrayList;

import static net.wac.dependencies.convertBinaryToAscii.setStringtoASCII;

public class Move {
	
	// Stores the memory adress given by the functions below
	static ArrayList<String> Memory = new ArrayList<String>();
	
	// Stores the instruction to be executed
	static ArrayList<String> InsCode = new ArrayList<String>();

	public static void MoveMem(String memAdress, String instructionCode) {
		registerMem(memAdress);
		InsCode.add(instructionCode);
		System.out.println(InsCode);
		
	}

	static void convertAndReadIns() {
		setStringtoASCII(String.valueOf(InsCode));
	}

	public static void readInsCode(String convertedString) {

	}
	
	public static void registerMem(String memAdress) {
		Memory.add(memAdress);
		System.out.println(Memory);
	}
		
	private static String class_name = "move";
	
	public static void main(String[] args) {
		
		System.out.println("Start of class: " + class_name);
		MoveMem("0x0", "01101101 01110110");
		convertAndReadIns();
	}
}

/*
 _   _
| \ | |
|  \| |
| . ` |
| |\  |
|_| \_|

© 2021 by Noah Eriksson
Note to user: THIS is a alpha build of Project Peach Vibe
This product is not for resale
Please consult user manual if needed.

*/
