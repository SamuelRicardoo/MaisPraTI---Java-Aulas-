public class Main {
    public static void main(String[] args) {

        IMeioTransporte[] transportes = new IMeioTransporte[3];
        transportes[0] = new Carro();
        transportes[1] = new Trem();
        transportes[2] = new Carro();

        for (IMeioTransporte transporte : transportes) {
            transporte.print();
        }
    }
}