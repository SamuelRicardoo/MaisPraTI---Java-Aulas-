public class Carro implements IMeioTransporte{


    @Override
    public void acelerar() {
        System.out.println("Carro acelerado");
    }

    @Override
    public void frear() {
        System.out.println("Carro freado");
    }

    @Override
    public void print() {
        acelerar();
        frear();
    }
}
