package com.example.demo.datasource

import com.example.demo.model.Task
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

@Repository
interface TaskRepository : CrudRepository<Task, Int> { }