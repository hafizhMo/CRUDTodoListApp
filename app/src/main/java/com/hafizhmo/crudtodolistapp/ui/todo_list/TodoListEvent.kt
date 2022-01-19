package com.hafizhmo.crudtodolistapp.ui.todo_list

import com.hafizhmo.crudtodolistapp.data.Todo

sealed class TodoListEvent {
    data class DeleteTodo(val todo: Todo): TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo):TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}
