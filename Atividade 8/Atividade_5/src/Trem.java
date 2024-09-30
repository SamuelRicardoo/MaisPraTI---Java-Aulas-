public class Trem implements IMeioTransporte{

    @Override
    public void acelerar() {
        System.out.println("Trem acelerado");
    }

    @Override
    public void frear() {
        System.out.println("Trem freado");
    }

    @Override
    public void print() {
        acelerar();
        frear();
    }
}
