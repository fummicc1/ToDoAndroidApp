package dev.fummicc1.sample.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.fummicc1.sample.todoapp.todolist.TodoListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = TodoListFragment()
        supportFragmentManager.beginTransaction().add(R.id.todo_list_fragment_container, fragment).commit()
    }
}