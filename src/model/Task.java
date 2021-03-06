package model;

import java.time.LocalDate;

public class Task {

    private static int contador;

    private int idTask;
    private String description;
    private boolean isDone;
    private LocalDate deadLine;

    public Task(String description, LocalDate deadLine){
        Task.contador++;
        this.idTask = Task.contador;
        this.description = description;
        this.isDone = false;
        this.deadLine = deadLine;
    }

    public int getIdTask() {
        return idTask;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public void doneTask(){
        this.isDone = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "idTask=" + idTask +
                ", description='" + description + '\'' +
                ", isDone=" + isDone +
                ", deadLine=" + deadLine +
                '}';
    }
}
