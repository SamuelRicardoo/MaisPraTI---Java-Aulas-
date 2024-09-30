public class CartaoCredito extends FormaPagamento{


    private double limite;

    public CartaoCredito(double limite) {

        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {

        if(valor > limite){
            validarPagamento(false);
            throw new IllegalArgumentException("O está acima do seu limite");

        }
        limite -= valor;
        validarPagamento(true);
    }

    @Override
    void validarPagamento(boolean isPagamento) {
        if (isPagamento) {
            System.out.println("Pagamento Efetuado com sucesso pelo Cartão de Credito");
        }
    }
}
