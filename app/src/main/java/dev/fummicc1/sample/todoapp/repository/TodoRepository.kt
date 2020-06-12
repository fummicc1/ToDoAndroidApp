package dev.fummicc1.sample.todoapp.repository

import dev.fummicc1.sample.todoapp.model.Todo
import java.util.*

object TodoRepository {
    fun mock(): List<Todo> {
        return (0..30).map {
            Todo(
                it,
                "Title$it",
                "Content$it",
                Date()
            )
        }
    }
}