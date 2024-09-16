import java.util.Scanner;

public class RunEditor {

    public static void Run(){
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            System.out.println("\n1. Adicionar Texto");
            System.out.println("2. Desfazer (Undo)");
            System.out.println("3. Mostrar Texto Atual");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int chose = sc.nextInt();
            sc.nextLine();

            switch (chose) {
                case 1:
                    System.out.print("Digite o texto a ser adicionado: ");
                    String texto = sc.nextLine();
                    editor.addText(texto);
                    break;

                case 2:
                    editor.undo();
                    break;

                case 3:
                    System.out.println("Texto atual: " + editor.getText());
                    break;

                case 4:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}