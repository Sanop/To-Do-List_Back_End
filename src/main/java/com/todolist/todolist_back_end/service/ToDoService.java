package com.todolist.todolist_back_end.service;

import com.todolist.todolist_back_end.entity.Todos;
import com.todolist.todolist_back_end.repsitory.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author : K.S.P.D De Silva <sanodeemantha@gmail.com>
 * @since : 4/22/21
 **/

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public void addToDo(Todos todo){
        toDoRepository.save(todo);
    }

    public List<Todos> getAllToDos(){
        return toDoRepository.findAll();
    }
}
