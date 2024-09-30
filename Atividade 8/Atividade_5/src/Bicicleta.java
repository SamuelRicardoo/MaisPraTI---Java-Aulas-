public class Bicicleta implements IMeioTransporte{


    @Override
    public void acelerar() {
        System.out.println("Bicicleta acelerado");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta freada");
    }

    @Override
    public void print() {
        acelerar();
        frear();
    }
}

