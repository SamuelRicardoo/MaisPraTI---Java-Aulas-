public class Estagiario extends Funcionario {


    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return salario * 0.05;
    }

    @Override
    public void trabalhar() {
        System.out.println("Estagiario Trabalhando");
    }

    @Override
    public double calcularSalario() {
        return salario + salario * 0.08;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }
}
