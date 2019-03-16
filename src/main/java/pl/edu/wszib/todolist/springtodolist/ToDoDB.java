/*
package pl.edu.wszib.todolist.springtodolist;

import pl.edu.wszib.todolist.springtodolist.model.Status;
import pl.edu.wszib.todolist.springtodolist.model.Todo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ToDoDB {

    private static List<Todo> TODOS = new ArrayList<>();

    static {
        IntStream.range(0, 10).forEach(i -> {
            Todo todo = new Todo();
            todo.id = i;
            todo.status = Status.NEW;
            todo.title = "TODO " + i;
            todo.dueDate = Calendar.getInstance().getTime();
            TODOS.add(todo);
        });
    }

    public static List<Todo> getAll() {
        return TODOS;
    }

    public static List<Todo> upcomming() {
        return TODOS.subList(0, 5);
    }

    public static List<Todo> search(Status status) {
        return TODOS.stream().filter(todo -> todo.status.equals(status)).collect(Collectors.toList());
    }

    public static Todo get(Long id) {
        return TODOS.stream().filter(todo -> todo.id == id).findFirst().orElse(null);
    }

    public static Todo add(Todo todo) {
        todo.status = Status.NEW;
        todo.id = new Random().nextInt();
        TODOS.add(todo);
        return todo;
    }

    public static Todo update(Todo todo) {
        TODOS.stream().filter(t -> t.id == todo.id).findFirst().ifPresent(t -> {
            t.status = todo.status;
            t.dueDate = todo.dueDate;
            t.title = todo.title;
        });
        return todo;
    }

    public static Todo remove(Long id) {
        Todo t = TODOS.stream().filter(todo -> todo.id == id).findFirst().orElse(null);
        TODOS.remove(t);
        return t;
    }

}
*/
