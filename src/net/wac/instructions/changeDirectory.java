package net.wac.instructions;

import java.util.Scanner;

public class changeDirectory {

    public static String class_name = "changeDirectory";
    public static String activeDirectory = "";
    public static String directoryName = "";

    public static void main(String[] args) {

        System.out.println("Start of class\n" + "Name: " + class_name);

        Scanner commandLine = new Scanner(System.in);
        System.out.println("Enter directory: ");

        directoryName = commandLine.nextLine();
        activeDirectory = (directoryName);
        System.out.println(activeDirectory);
    }
}
