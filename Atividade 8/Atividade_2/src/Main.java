public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Caneta", 1.50, 100);
        produto.exibirInformacoes();

        try {
            produto.aplicarDesconto(80);
            System.out.println("Após aplicar 20% de desconto:");
            produto.exibirInformacoes();
        }catch (IllegalArgumentException e){
            System.out.println("erro: " + e.getMessage());
        }

    }
}