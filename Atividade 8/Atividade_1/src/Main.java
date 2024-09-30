public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Caneta", 1.50, 100);
        produto.exibirInformacoes();

        produto.setPreco(2.00);
        produto.setQuantidade(120);

        produto.exibirInformacoes();
    }
}