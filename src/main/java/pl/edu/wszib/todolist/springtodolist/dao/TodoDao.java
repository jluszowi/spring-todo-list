package pl.edu.wszib.todolist.springtodolist.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.todolist.springtodolist.model.Status;
import pl.edu.wszib.todolist.springtodolist.model.Todo;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface TodoDao extends CrudRepository<Todo, Integer > {

    List<Todo> findAll();
    List<Todo> findTop5ByStatusIsNotOrderByDueDateAsc(Status status);
    int countAllByStatus(Status status);
    List<Todo> findAllByStatus(Status status);


/*
    @Query("SELECT t from Todo t where t.status not like 'Completed' order by t.dueDate asc")
    List<Todo> query();
 */

}
