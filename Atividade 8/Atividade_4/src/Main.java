public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Alice", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Bob", 4000);

        System.out.println("Gerente: " + gerente.getNome() + ", Salário: " + gerente.getSalario() + ", Bônus: " + gerente.calculaBonus());
        System.out.println("Desenvolvedor: " + desenvolvedor.getNome() + ", Salário: " + desenvolvedor.getSalario() + ", Bônus: " + desenvolvedor.calculaBonus());
        gerente.trabalhar();
        desenvolvedor.trabalhar();
    }
}