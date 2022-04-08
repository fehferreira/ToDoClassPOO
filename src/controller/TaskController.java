package controller;

import model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskController {

    private List<Task> list = new ArrayList<>();

    /* Método com a responsabilidade de criação da Task */
    public Task createTask(String description, LocalDate deadLine) {
        Task newTask = new Task(description, deadLine);
        list.add(newTask);
        return newTask;
    }

    /* Método com a responsabilidade de retorno da lista */
    public List<Task> listTask() {
        return this.list;
    }

    public Task findTask(int id) {
        List<Task> filteredList =
                this.list.stream()
                        .filter(item -> item.getIdTask() == id)
                        .collect(Collectors.toList());
        return filteredList.get(0);
    }

    public void updateTask(String updateDescription, LocalDate updateDeadLine, int id){
        Task oldTask = this.findTask(id);
        if(!updateDescription.isEmpty() && updateDescription != null){
            oldTask.setDescription(updateDescription);
        }

        if(updateDeadLine != null){
            oldTask.setDeadLine(updateDeadLine);
        }
    }

}
