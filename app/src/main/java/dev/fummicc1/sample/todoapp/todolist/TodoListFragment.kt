package dev.fummicc1.sample.todoapp.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.fummicc1.sample.todoapp.R
import kotlinx.android.synthetic.main.todo_list_fragment.*

class TodoListFragment : Fragment() {

    companion object {
        fun newInstance() =
            TodoListFragment()
    }

    private val viewModel: TodoListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.todo_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        viewModel.getTodos().observe(viewLifecycleOwner, Observer {

        })
    }

}