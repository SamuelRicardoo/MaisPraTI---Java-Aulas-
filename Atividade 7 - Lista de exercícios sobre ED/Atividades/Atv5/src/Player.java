import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Letter> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void addLetter(Letter letter) {
        hand.add(letter);
        System.out.println("Carta adicionada: " + letter);
    }

    public void removeLetter(int index) {
        if (index >= 0 && index < hand.size()) {
            Letter removida = hand.remove(index);
            System.out.println("Carta removida: " + removida);
        } else {
            System.out.println("Índice inválido!");
        }
    }


    public void orderLetter(int pos1, int pos2) {
        if (pos1 >= 0 && pos2 >= 0 && pos1 < hand.size() && pos2 < hand.size()) {
            Letter temp = hand.get(pos1);
            hand.set(pos1, hand.get(pos2));
            hand.set(pos2, temp);
            System.out.println("Cartas reorganizadas!");
        } else {
            System.out.println("Índices inválidos!");
        }
    }

    public void getHand() {
        if (hand.isEmpty()) {
            System.out.println("A mão está vazia.");
        } else {
            System.out.println("Mão do jogador:");
            for (int i = 0; i < hand.size(); i++) {
                System.out.println(i + ": " + hand.get(i));
            }
        }
    }




}
