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

    @Override
    public double calcularSalario() {
        return salario * 1.20;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.30;
    }
}
