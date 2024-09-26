import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();
        Player player = new Player();

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\nBem-vindo ao jogo de cartas! Escolha uma opção:");
            System.out.println("1. Exibir todas as cartas no baralho");
            System.out.println("2. Embaralhar o baralho");
            System.out.println("3. Tirar 10 cartas aleatórias");
            System.out.println("4. Adicionar carta à mão");
            System.out.println("5. Remover carta da mão");
            System.out.println("6. Reorganizar cartas na mão");
            System.out.println("7. Exibir a mão");
            System.out.println("8. Sair do jogo");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Exibindo todas as cartas do baralho:");
                    List<Letter> cartas = deck.getCards();
                    for (Letter carta : cartas) {
                        System.out.println(carta);
                    }
                    break;

                case 2:
                    System.out.println("Embaralhando o baralho...");
                    deck.shuffleDeck();
                    System.out.println("Baralho embaralhado com sucesso!");
                    break;

                case 3:
                    System.out.println("Retirando 10 cartas aleatórias...");
                    List<Letter> cartasAleatorias = deck.randomCards();
                    for (Letter carta : cartasAleatorias) {
                        System.out.println(carta);
                    }
                    break;

                case 4:
                    System.out.println("Escolha uma carta para adicionar à mão:");
                    List<Letter> cartasDoBaralho = deck.getCards();
                    for (int i = 0; i < cartasDoBaralho.size(); i++) {
                        System.out.println(i + ": " + cartasDoBaralho.get(i));
                    }
                    int cartaEscolhida = sc.nextInt();
                    if (cartaEscolhida >= 0 && cartaEscolhida < cartasDoBaralho.size()) {
                        player.addLetter((cartasDoBaralho.get(cartaEscolhida)));
                    } else {
                        System.out.println("Carta inválida!");
                    }
                    break;

                case 5:
                    System.out.println("Escolha uma carta para remover da mão:");
                    player.getHand();
                    int cartaRemover = sc.nextInt();
                    player.removeLetter(cartaRemover);
                    break;

                case 6:
                    System.out.println("Escolha as posições das cartas que deseja trocar:");
                    player.getHand();
                    System.out.print("Primeira posição: ");
                    int pos1 = sc.nextInt();
                    System.out.print("Segunda posição: ");
                    int pos2 = sc.nextInt();
                    player.orderLetter(pos1, pos2);
                    break;

                case 7:
                    player.getHand();
                    break;

                case 8:
                    System.out.println("Saindo do jogo. Até mais!");
                    run = false;
                    break;

                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }
        sc.close();
    }
}
