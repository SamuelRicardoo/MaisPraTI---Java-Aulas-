import java.util.Scanner;

public class RunEditor {
    public static void Run(){
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            System.out.println("\nEditor de Texto");
            System.out.println("1. Adicionar Ação");
            System.out.println("2. Desfazer Última Ação");
            System.out.println("3. Refazer Última Ação");
            System.out.println("4. Mostrar Histórico");
            System.out.println("5. Mostrar Ação Atual");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int chose = sc.nextInt();
            sc.nextLine();

            switch (chose) {
                case 1:
                    System.out.print("Digite a ação: ");
                    String action = sc.nextLine();
                    editor.addAction(action);
                    break;
                case 2:
                    editor.undo();
                    break;
                case 3:
                    editor.redo();
                    break;
                case 4:
                    editor.showHistory();
                    break;
                case 5:
                    editor.showCurrentAction();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    sc.close();
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
