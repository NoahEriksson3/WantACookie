package net.wac.main;

import net.wac.dependencies.print_func;

public class main {
	
	private static String class_name = "main";
	
	public static void main(String[] args) {
		System.out.println("Want a cookie?");
		System.out.println("Start of class\n" + "Name: " + class_name);
		
		print_func p = new print_func();

		  p.print("  _   _ \r\n"
				+ " | \\ | |\r\n"
				+ " |  \\| |\r\n"
				+ " | . ` |\r\n"
				+ " | |\\  |\r\n"
				+ " |_| \\_|\r\n"
				+ "");
		p.print("© 2021 by Noah Eriksson");
		p.print("Note to user: THIS is an alpha build of WantACookie");
		p.print("This product is not for resale");
		p.print("Please consult user manual if needed.");
		
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