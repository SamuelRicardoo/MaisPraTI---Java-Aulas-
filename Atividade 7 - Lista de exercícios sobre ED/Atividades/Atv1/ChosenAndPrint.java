import java.util.ArrayList;
import java.util.Scanner;

public class ChosenAndPrint {

    public static void chosen() {
        Scanner sc = new Scanner(System.in);
        ListTask listTask = new ListTask(new ArrayList<>());

        while (true) {
            System.out.println("\nGerenciador de Tarefas");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Marcar Tarefa como Concluída");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int chose = sc.nextInt();

            switch (chose) {
                case 1:
                    //Add Task
                    System.out.println("Digite o nome da tarefa: ");
                    String name = sc.next();
                    System.out.print("Digite a descrição da tarefa: ");
                    String description = sc.next();
                    listTask.addTask(new Task(name, description));
                    break;

                case 2:
                    // Marcar Tarefa como Concluída
                    System.out.print("Digite o ID da tarefa para marcar como concluída: ");
                    int idAdd = sc.nextInt();
                    listTask.isDone(idAdd);
                    System.out.println("Tarefa marcada como concluída.");
                    break;

                case 3:
                    // Remover Tarefa
                    System.out.print("Digite o ID da tarefa a ser removida: ");
                    int idRemove = sc.nextInt();
                    listTask.removeTask(idRemove);
                    break;

                case 4:
                    // Listar Tarefas
                    System.out.println("Lista de tarefas:");
                    for (Task task : listTask.getTask()) {
                        System.out.println(task);
                    }
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}