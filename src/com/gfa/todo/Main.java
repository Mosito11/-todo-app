package com.gfa.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println();
            System.out.println("Command Line Todo application");
            System.out.println("=============================");
            System.out.println();
            System.out.println("Command line arguments:");
            System.out.println();
            System.out.println("-l   Lists all the tasks");
            System.out.println("-a   Adds a new task");
            System.out.println("-r   Removes a task");
            System.out.println("-c   Completes a task");
            System.out.println();
        } else {

            if (args[0].equals("-l")) {
                ;
            }


        }
    }


//    public static void printListOfTasks() throws IOException {
//
//        String pathToTaskFile = "tasks2.txt";
//        Path pathToFile = Path.of(pathToTaskFile);
//        List<String> lines = Files.readAllLines(pathToFile);
//        System.out.println();
//        if (lines.size() == 0) {
//            System.out.println("No todos for today! :)");
//        } else {
//            for (int i = 0; i < lines.size(); i++) {
//                System.out.println(i + 1 + ". " + lines.get(i));
//            }
//        }
//    }


}
