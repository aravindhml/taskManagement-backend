package com.project.taskMangement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.taskManagement.model.Task;
import com.project.taskManagement.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }

    public List<Task> getTasksByAssignee(Long assigneeId) {
        return taskRepository.findByAssigneeId(assigneeId);
    }
}
