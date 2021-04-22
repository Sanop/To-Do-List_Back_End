package com.todolist.todolist_back_end.entity;

import com.todolist.todolist_back_end.util.Priority;

import javax.persistence.*;

/**
 * @author : K.S.P.D De Silva <sanodeemantha@gmail.com>
 * @since : 4/22/21
 **/

@Entity
@Table
public class Todos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String text;
    private boolean isComplete;
    private Priority priority;

    public Todos(int id, String text, boolean isComplete, Priority priority) {
        this.id = id;
        this.text = text;
        this.isComplete = isComplete;
        this.priority = priority;
    }

    public Todos() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Todos{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", isComplete=" + isComplete +
                ", priority=" + priority +
                '}';
    }
}
