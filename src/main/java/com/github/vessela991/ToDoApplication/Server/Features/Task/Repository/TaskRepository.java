package com.github.vessela991.ToDoApplication.Server.Features.Task.Repository;

import com.github.vessela991.ToDoApplication.Server.Data.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
