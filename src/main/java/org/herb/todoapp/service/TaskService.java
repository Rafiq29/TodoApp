package org.herb.todoapp.service;

import org.herb.todoapp.repo.TaskRepo;
import org.herb.todoapp.entity.Task;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepo repo;

    public TaskService(TaskRepo repo) {
        this.repo = repo;
    }

    public void addTask(Task task) {
        repo.save(task);
    }

//    public void updateTask(Task task, long id) {
//        Optional<Task> taskById = repo.findById(id);
//        repo.update(task, id);
//    }

    public Task getById(long id) {
        Optional<Task> taskById = repo.findById(id);
        return taskById.orElseThrow();
    }

    public Iterable<Task> getAll() {
        return repo.findAll();
    }

    public void deleteTask(long id) {
        repo.deleteById(id);
    }
}
