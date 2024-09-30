public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public void trabalhar() {
        System.out.println("Trabalhando como Desenvolvedor");
    }


    @Override
    public double calcularSalario() {
        return salario * 1.00;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}
