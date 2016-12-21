package com.greenfox;

/**
 * Created by Zsuzska on 2016. 12. 20..
 */
public class Todo {
    int id;
    String title;
    boolean isUrgent;
    boolean isDone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public Todo(){}

    public Todo(int id, String title, boolean isUrgent, boolean isDone) {
        this.id = id;
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }

    public Todo(int id, String title){
        this.id = id;
        this.title = title;
    }
}
