package dev.fummicc1.sample.todoapp.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.fummicc1.sample.todoapp.R
import dev.fummicc1.sample.todoapp.model.Todo

class TodoListFragment : Fragment() {
    private val viewModel: TodoListViewModel by activityViewModels()
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: TodoListAdapter
    private lateinit var viewManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.todo_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewManager = LinearLayoutManager(context)
        viewAdapter = TodoListAdapter(mutableListOf())
        activity?.findViewById<RecyclerView>(R.id.recyclerView)?.apply {
            setHasFixedSize(true)
            adapter = viewAdapter
            layoutManager = viewManager
        }?.let {
            recyclerView = it
        }
        viewModel.getTodos().observe(viewLifecycleOwner, Observer { viewAdapter })
    }

    class Observer(private val adapter: TodoListAdapter): androidx.lifecycle.Observer<MutableList<Todo>> {
        override fun onChanged(t: MutableList<Todo>?) {
            t?.let {
                adapter.update(it)
            }
        }
    }
}