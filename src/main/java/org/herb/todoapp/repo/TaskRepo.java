package org.herb.todoapp.repo;

import org.herb.todoapp.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends CrudRepository<Task, Long> {
//    void update(Task task, long id);
}
