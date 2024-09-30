public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return salario * 0.20;
    }

    @Override
    public void trabalhar() {
        System.out.println("Trabalhando como Gerente");
    }
}
