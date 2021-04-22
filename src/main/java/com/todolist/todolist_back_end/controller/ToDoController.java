package com.todolist.todolist_back_end.controller;

import com.todolist.todolist_back_end.entity.Todos;
import com.todolist.todolist_back_end.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author : K.S.P.D De Silva <sanodeemantha@gmail.com>
 * @since : 4/22/21
 **/

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @PostMapping
    public void addToDo(@RequestBody Todos todo){
        try {
            toDoService.addToDo(todo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping
    public List<Todos> getAllToDos(){
        List<Todos> allToDos = new ArrayList<>();
        try {
            allToDos = toDoService.getAllToDos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allToDos;
    }
}
