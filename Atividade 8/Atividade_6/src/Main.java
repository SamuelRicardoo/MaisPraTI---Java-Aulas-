import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animal = new ArrayList<>();
        Animal cachorro = new Cachorro();
        Animal vaca = new Vaca();
        Animal gato = new Gato();

        animal.add(cachorro);
        animal.add(vaca);
        animal.add(gato);

        for (Animal a : animal) {
            a.emitirSom();
        }

    }
}