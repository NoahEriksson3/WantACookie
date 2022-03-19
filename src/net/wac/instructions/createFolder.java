package net.wac.instructions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class createFolder {

    private static String class_name = "wacFS";
    public static String OSfilePath = "net.wac.os.fs";
    public static String createFilePath = "";



    public static void main(String[] args) {

        System.out.println("Start of class\n" + "Name: " + class_name);

        Scanner UserInput = new Scanner(System.in); // Create scanner object
        System.out.println("Enter pathname: ");

        createFilePath = UserInput.nextLine(); // Read user input
        System.out.println("Pathname is: " + createFilePath); // Output user input

        try {
            boolean newFolder = new File(createFilePath).mkdirs();
        } finally {
            System.out.println("Folder created");
        }
    }
}
