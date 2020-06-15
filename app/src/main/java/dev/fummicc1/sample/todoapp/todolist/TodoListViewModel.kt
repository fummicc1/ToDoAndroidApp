package dev.fummicc1.sample.todoapp.todolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.fummicc1.sample.todoapp.model.Todo
import dev.fummicc1.sample.todoapp.repository.TodoRepository

class TodoListViewModel() : ViewModel() {
    private var todos = MutableLiveData<List<Todo>>()
    private val repository = TodoRepository

    fun getTodos(): LiveData<List<Todo>> {
        val todos = repository.mock()
        this.todos.value = todos
        return this.todos
    }
}