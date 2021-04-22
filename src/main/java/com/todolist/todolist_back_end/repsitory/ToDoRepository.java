package com.todolist.todolist_back_end.repsitory;

import com.todolist.todolist_back_end.entity.Todos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : K.S.P.D De Silva <sanodeemantha@gmail.com>
 * @since : 4/22/21
 **/

@Repository
public interface ToDoRepository extends JpaRepository<Todos,Integer> {
}
