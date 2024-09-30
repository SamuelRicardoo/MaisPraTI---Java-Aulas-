public class Main {
    public static void main(String[] args) {


        FormaPagamento pagamentoCartao = new CartaoCredito(5000);  // Limite de 5000
        FormaPagamento pagamentoBoleto = new Boleto(1000);
        FormaPagamento pagamentoPix = new Pix();

        System.out.println("==CARTÃO===");
        pagamentoCartao.processarPagamento(2000);

        System.out.println("==BOLETO===");

        pagamentoBoleto.processarPagamento(1500);

        System.out.println("==PIX===");

        pagamentoPix.processarPagamento(750);

    }
}