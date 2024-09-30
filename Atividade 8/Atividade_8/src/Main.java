public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Funcionario gerente = new Gerente("João", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Maria", 4000);
        Funcionario estagiario = new Estagiario("Pedro", 1500);

        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(desenvolvedor);
        empresa.adicionarFuncionario(estagiario);

        System.out.println("Folha de Pagamento Inicial:");
        empresa.calcularFolhaPagamento();

        empresa.promoverFuncionario(estagiario, "Desenvolvedor");

        System.out.println("Folha de Pagamento Após Promoção:");
        empresa.calcularFolhaPagamento();

    }
}