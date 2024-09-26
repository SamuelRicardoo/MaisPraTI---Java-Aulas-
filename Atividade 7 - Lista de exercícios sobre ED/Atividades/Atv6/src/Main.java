import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Queue<Client> clientes = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Simulador de Fila de Atendimento do Banco ---");
            System.out.println("1. Adicionar cliente à fila");
            System.out.println("2. Chamar próximo cliente");
            System.out.println("3. Exibir fila de clientes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String name = sc.nextLine();
                    Client newClient = new Client (name);
                    clientes.add(newClient);
                    System.out.println("Cliente " + name + " adicionado à fila.");
                    break;

                case 2:
                    if (!clientes.isEmpty()) {
                        Client clienteAtendido = clientes.poll();
                        System.out.println("Chamando o próximo cliente: " + clienteAtendido.getName());
                    } else {
                        System.out.println("Nenhum cliente na fila.");
                    }
                    break;

                case 3:
                    if (clientes.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Clientes na fila de atendimento:");
                        for (Client cliente : clientes) {
                            System.out.println(cliente.getName());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o simulador. Até mais!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        sc.close();
    }
}