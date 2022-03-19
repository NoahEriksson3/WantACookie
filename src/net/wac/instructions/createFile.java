package net.wac.instructions;

import java.io.File;
import java.io.IOException;

public class createFile {

    private static String class_name = "createFile";
    public static String fileName = "";

    public static void main(String[] args) {

        System.out.println("Start of class\n" + "Name: " + class_name);

        try {
            File createFile = new File(fileName);
            if(createFile.createNewFile()) {
                System.out.println("File created: " + createFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
