package dev.fummicc1.sample.todoapp.todolist

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.fummicc1.sample.todoapp.R
import dev.fummicc1.sample.todoapp.model.Todo

class TodoListViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    fun bind(todo: Todo) {
         view.findViewById<TextView>(R.id.titleTextView).text = todo.title
    }
}