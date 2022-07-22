package org.herb.todoapp.controller;

import org.herb.todoapp.entity.Task;
import org.herb.todoapp.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping()
    public void add(@RequestBody Task task) {
        service.addTask(task);
    }

//    @PatchMapping("/update/{id}")
//    public void update(@RequestBody Task task, @PathVariable("id") long id) {
//        service.updateTask(task, id);
//    }

    @GetMapping("/{id}")
    public Task getById(@PathVariable("id") long id) {
        return service.getById(id);
    }

    @GetMapping
    public Iterable<Task> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        service.deleteTask(id);
    }
}
