package com.example.demo.service

import com.example.demo.datasource.TaskRepository
import com.example.demo.model.Task
import org.springframework.stereotype.Service

@Service
class TaskService(private val dataSource: TaskRepository) {

    fun getAllTasks(): MutableList<Task> {
        val result = mutableListOf<Task>()
        val all = dataSource.findAll()
        result.addAll(all)

        return result
    }

    fun deleteTask(id: Int): Task {
        val result = dataSource.findById(id)
        dataSource.deleteById(id)
        return result.get()
    }

    fun updateTask(task: Task, id: Int): Task {
        task.id = id
        return dataSource.save(task)
    }

    fun getTaskDetails(id: Int): Task {
        return dataSource.findById(id).get()
    }

    fun addTask(task: Task): Task {
        return dataSource.save(task)
    }

}