package dev.fummicc1.sample.todoapp.todolist

import android.app.Activity
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.fummicc1.sample.todoapp.R
import dev.fummicc1.sample.todoapp.model.Todo

class TodoListAdapter(private var todos: MutableList<Todo>): RecyclerView.Adapter<TodoListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
        val inflate = (parent.context as Activity).layoutInflater
        val view = inflate.inflate(R.layout.sample_todo_list_item_view, parent, true)
        val viewHolder = TodoListViewHolder(view)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return todos.count()
    }

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
        holder.bind(todos[position])
    }

    fun update(todos: MutableList<Todo>) {
        this.todos = todos
        notifyDataSetChanged()
    }
}