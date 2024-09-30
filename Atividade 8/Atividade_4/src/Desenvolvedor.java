public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public double calculaBonus() {
        return salario * 0.10;
    }

    @Override
    public void trabalhar() {
        System.out.println("Trabalhando como Desenvolvedor");
    }
}
