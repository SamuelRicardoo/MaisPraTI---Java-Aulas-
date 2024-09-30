import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        QueueJob queueJob = new QueueJob();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\n--- Gerenciador de Impressões ---");
            System.out.println("1. Adicionar trabalho de impressão");
            System.out.println("2. Processar próximo trabalho");
            System.out.println("3. Mostrar trabalhos na fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do documento: ");
                    String documentName = sc.nextLine();
                    int jobId = queueJob.getJobCount()+ 1;
                    Job newJob = new Job(documentName, jobId);
                    queueJob.addJob(newJob);
                    break;

                case 2:
                    queueJob.processNextJob();
                    break;

                case 3:
                    queueJob.showJobs();
                    break;

                case 4:
                    System.out.println("Encerrando o gerenciador de impressões. Até mais!");
                    run = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}