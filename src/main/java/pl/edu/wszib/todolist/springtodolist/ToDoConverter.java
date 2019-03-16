/*
package pl.edu.wszib.todolist.springtodolist;

import pl.edu.wszib.todolist.springtodolist.dto.TodoDTO;
import pl.edu.wszib.todolist.springtodolist.model.Status;
import pl.edu.wszib.todolist.springtodolist.model.Todo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ToDoConverter {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static TodoDTO convert(Todo todo) {
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.id = todo.id;
        todoDTO.status = todo.status.toString();
        todoDTO.title = todo.title;
        todoDTO.dueDate = dateFormat.format(todo.dueDate);
        return todoDTO;
    }

    public static Todo convert(TodoDTO todoDTO) {
        Todo todo = new Todo();
        todo.id = todoDTO.id;
        if(todoDTO.status != null) {
            todo.status = Status.valueOf(todoDTO.status);
        }
        todo.title = todoDTO.title;
        try {
            todo.dueDate = dateFormat.parse(todoDTO.dueDate);
        } catch (ParseException e) {
//ignore
        }
        return todo;
    }

}
*/
