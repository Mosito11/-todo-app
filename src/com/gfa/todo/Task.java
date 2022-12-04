package com.gfa.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task extends Main {

    protected String description;
    protected boolean completed;

    public Task(String description)  {
        this.description = description;
        this.completed = false;


    }



    public static List<Task> createListFromFile(String pathToFile) throws IOException {

        Path path = Path.of(pathToFile);
        List<String> lines = Files.readAllLines(path);
        List<Task> toDoList = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
                Task task = new Task(lines.get(i));
                toDoList.add(task);
            }
        return toDoList;
    }

}
