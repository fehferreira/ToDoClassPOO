package model;

import java.time.LocalDate;

public class Task {

    private static int contador;

    private int idTodo;
    private String description;
    private boolean isDone;
    private LocalDate deadLine;

    public Task(String description, LocalDate deadLine){
        this.idTodo = Task.contador + 1;
        this.description = description;
        this.isDone = false;
        this.deadLine = deadLine;
    }

    public int getIdTodo() {
        return idTodo;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }
}
