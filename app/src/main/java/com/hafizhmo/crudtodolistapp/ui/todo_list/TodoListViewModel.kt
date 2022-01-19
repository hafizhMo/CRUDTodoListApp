package com.hafizhmo.crudtodolistapp.ui.todo_list

import androidx.lifecycle.ViewModel
import com.hafizhmo.crudtodolistapp.data.TodoRepository
import com.hafizhmo.crudtodolistapp.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
) : ViewModel() {

    val todos = repository.getTodos()

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    fun onEvent(event: TodoListEvent) {
        when (event) {
            is TodoListEvent.OnTodoClick -> {

            }
            is TodoListEvent.OnAddTodoClick -> {

            }
            is TodoListEvent.OnUndoDeleteClick -> {

            }
            is TodoListEvent.DeleteTodo -> {

            }
            is TodoListEvent.OnDoneChange -> {

            }
        }
    }
}