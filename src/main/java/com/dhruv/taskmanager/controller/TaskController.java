package com.dhruv.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TaskController {

    private final ObjectMapper mapper = new ObjectMapper();
    private final File file = new File("src/main/resources/tasks.json");

    @GetMapping("/tasks")
    public List<Task> getTasks() throws Exception {
        if (!file.exists()) {
            return new ArrayList<>();
        }
        return mapper.readValue(file, new TypeReference<List<Task>>() {});
    }

    @PostMapping("/tasks")
    public List<Task> addTask(@RequestBody Task task) throws Exception {
        List<Task> tasks = getTasks();
        task.setId(tasks.size() + 1);
        tasks.add(task);
        mapper.writeValue(file, tasks);
        return tasks;
    }
}
