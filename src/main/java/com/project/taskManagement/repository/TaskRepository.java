package com.project.taskManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.taskManagement.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

    List<Task> findByAssigneeId(Long assigneeId);
    List<Task> findByStatus(String status);
}
