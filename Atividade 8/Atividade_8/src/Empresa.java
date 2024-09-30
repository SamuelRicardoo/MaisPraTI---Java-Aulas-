import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void removerFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void calcularFolhaPagamento(){
        double totalSalario = 0;
        double TotalBonus = 0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario();
            double bonus = funcionario.calcularBonus();
            totalSalario += salario;
            TotalBonus += bonus;
        }

        System.out.println("Total de Salários: " + totalSalario);
        System.out.println("Total de Bônus: " + TotalBonus);
    }

    public void promoverFuncionario(Funcionario funcionario, String novoCargo) {

        Funcionario novoFuncionario = null;

        if (novoCargo.equalsIgnoreCase("Gerente")) {
            novoFuncionario = new Gerente(funcionario.getNome(), funcionario.getSalario());
        } else if (novoCargo.equalsIgnoreCase("Desenvolvedor")) {
            novoFuncionario = new Desenvolvedor(funcionario.getNome(), funcionario.getSalario());
        } else if (novoCargo.equalsIgnoreCase("Estagiario")) {
            novoFuncionario = new Estagiario(funcionario.getNome(), funcionario.getSalario());
        }

        if (novoFuncionario != null) {
            removerFuncionario(funcionario);
            adicionarFuncionario(novoFuncionario);
            System.out.println("Funcionário " + funcionario.getNome() + " promovido a " + novoCargo);
        } else {
            System.out.println("Cargo inválido para promoção!");
        }

    }
}