import java.util.Scanner;

public class ProcessManager {

    public static void ManagerRun(){

        QueueProcess q = new QueueProcess();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while(run){

            System.out.println("\n--- Gerenciador de Processos ---");
            System.out.println("1. Adicionar novo processo");
            System.out.println("2. Executar próximo processo");
            System.out.println("3. Mostrar processos na fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do processo: ");
                    String processName = sc.nextLine();
                    int processId = q.getProcessCount() + 1;
                    Process newProcess = new Process(processName, processId);
                    q.addProcess(newProcess);
                    break;

                case 2:
                    q.executeNextProcess();
                    break;

                case 3:
                    q.showProcesses();
                    break;

                case 4:
                    System.out.println("Encerrando o gerenciador de processos. Até mais!");
                    run = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        sc.close();
    }
}