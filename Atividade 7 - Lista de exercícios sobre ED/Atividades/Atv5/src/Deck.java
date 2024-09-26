
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private final String[] naipes = {"Copas", "Espadas", "Ouros", "Paus"};

    private List<Letter> cards;

    public Deck() {
        cards = new ArrayList<Letter>();
        fillDeck();
    }

    private void fillDeck(){
       for(String naip : naipes){
           for(String valor : valores){
               cards.add(new Letter(valor,naip));
           }
       }
    }

    public List<Letter> getCards() {
        return cards;
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public List<Letter> randomCards() {
        List<Letter> randomCards = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomCards.add(cards.get((int) (Math.random() * cards.size())));
        }
        return randomCards;
    }
}