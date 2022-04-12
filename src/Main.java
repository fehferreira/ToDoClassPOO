import controller.TaskController;
import model.Task;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static TaskController controller = new TaskController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        while (choose != 7) {
            System.out.println("================ TO DO LIST ================= \n" +
                    "============================================= \n" +
                    "====    1. Criar uma tarefa              ==== \n" +
                    "====    2. Listar as tarefas             ==== \n" +
                    "====    3. Procurar uma tarefa           ==== \n" +
                    "====    4. Editar uma tarefa             ==== \n" +
                    "====    5. Concluir uma tarefa           ==== \n" +
                    "====    6. Deletar uma tarefa            ==== \n" +
                    "====    7. Fechar o programa             ==== \n" +
                    "============================================= \n");
            while (!scanner.hasNext()) ;
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    Main.createTask(scanner);
                    break;
                case 2:
                    System.out.println("2. Listar as tarefas");
                    break;
                case 3:
                    System.out.println("3. Procurar uma tarefa");
                    break;
                case 4:
                    System.out.println("4. Editar uma tarefa");
                    break;
                case 5:
                    System.out.println("5. Concluir uma tarefa");
                    break;
                case 6:
                    System.out.println("6. Deletar uma tarefa");
                    break;
            }
        }
    }

    private static void createTask(Scanner scanner){
        scanner.nextLine();
        System.out.println("====    Insira a descrição da tarefa:    ====");
        String description = scanner.nextLine();
        System.out.println("====   Insira a data limite(AAAA-MM-DD): ====");
        String limitDate = scanner.next();
        Task newTask = Main.controller.createTask(description, LocalDate.parse(limitDate));
        System.out.println(newTask);
    }
}