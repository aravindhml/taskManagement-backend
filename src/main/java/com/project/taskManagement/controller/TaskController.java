package com.project.taskManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.taskManagement.model.Task;
import com.project.taskMangement.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	 @Autowired
	    private TaskService taskService;

	    @PostMapping
	    public Task createTask(@RequestBody Task task) {
	        return taskService.createTask(task);
	    }

//	    @GetMapping("/{id}")
//	    public Task getTaskById(@PathVariable Long id) {
//	        return taskService.getTaskById(id);
//	    }

	    @GetMapping("/user/{assigneeId}")
	    public List<Task> getTasksByUser(@PathVariable Long assigneeId) {
	        return taskService.getTasksByAssignee(assigneeId);
	    }

	    @PutMapping("/{id}")
	    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
	        task.setId(id);
	        return taskService.updateTask(task);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteTask(@PathVariable Long id) {
	        taskService.deleteTask(id);
	    }
	
}
