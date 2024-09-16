import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        History history = new History();

        while (true){
            System.out.println("1. Adicionar URL");
            System.out.println("2. Listar Histórico");
            System.out.println("3. Sair");

            int chosen = sc.nextInt();

            switch (chosen) {
                case 1:
                    System.out.print("Digite a URL para adicionar ao histórico: ");
                    String urlAdd = sc.next();
                    history.addUrl(urlAdd);
                    break;

                case 2:
                    System.out.println("Histórico de Navegação:");
                    history.getNavigation();
                    break;

                case 3:
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