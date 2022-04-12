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

    /* Método com a responsabilidade de achar a Task desejada */
    public Task findTask(int id) {
        List<Task> filteredList =
                this.list.stream()
                        .filter(item -> item.getIdTask() == id)
                        .collect(Collectors.toList());
        return filteredList.get(0);
    }

    /* Método com a responsabilidade de atualização de uma Task*/
    public Task updateTask(String updateDescription, LocalDate updateDeadLine, int id){
        Task task = this.findTask(id);
        if(!updateDescription.isEmpty() && updateDescription != null){
            task.setDescription(updateDescription);
        }

        if(updateDeadLine != null){
            task.setDeadLine(updateDeadLine);
        }

        int indexOldTask = this.list.indexOf(task);
        this.list.add(indexOldTask, task);
        return task;
    }

    /* Métodocom a responsabilidade de deletar uma Task */
    public void deleteTask(int id){
        Task task = this.findTask(id);
        this.list.remove(task);
    }

}
