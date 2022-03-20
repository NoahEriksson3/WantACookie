package net.wac.dependencies;

import net.wac.instructions.changeDirectory;
import net.wac.instructions.createFile;
import net.wac.instructions.createFolder;

import java.util.ArrayList;
import java.util.Scanner;

public class commandLine {

    private static String class_name = "commandLine";
    public static String command = "";
    static ArrayList<String> commands = new ArrayList<String>();

    public static void main(String[] args) {

        if(command == "exit") {
            System.out.println("exit successfully executed");
            System.exit(1);
        }

        if(command == "mkfile") {
            createFile.main(null);
            System.out.println("createFile successfully executed");
        }

        if(command == "mkdir") {
            createFolder.main(null);
            System.out.println("createFolder successfully executed");
        }

        if(command == "cd") {
            changeDirectory.main(null);
            System.out.println("changeDirectory successfully executed");
        }

        System.out.println("Start of class\n" + "Name: " + class_name);

        Scanner commandLine = new Scanner(System.in);
        System.out.println("Enter command: ");

        command = commandLine.nextLine();
        System.out.println("The command called for is: " + command);

        commands.add("cd");
        commands.add("mkfile");
        commands.add("mkdir");
        commands.add("exit");
    }
}
