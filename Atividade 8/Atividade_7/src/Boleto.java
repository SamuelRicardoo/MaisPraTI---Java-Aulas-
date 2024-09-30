public class Boleto extends FormaPagamento{

    private double valorBoleto;

    public Boleto(double valorBoleto) {
        this.valorBoleto = valorBoleto;
    }

    public double getValorBoleto() {
        return valorBoleto;
    }

    public void setValorBoleto(double valorBoleto) {
        this.valorBoleto = valorBoleto;
    }

    @Override
    public void processarPagamento(double valor) {

        if(valor > valorBoleto){
            double troco = valor - valorBoleto;
            System.out.println("O seu troco foi de: "+ troco);
            validarPagamento(true);
        } else if (valor < valorBoleto) {
            validarPagamento(false);
            throw  new IllegalArgumentException("Valor insuficiente para pagamento");
        }else {
            System.out.println("Boleto pago");
            validarPagamento(true);
        }
    }

    @Override
    void validarPagamento(boolean isPagamento) {
        if(isPagamento){
            System.out.println("Pagamento Efetuado pelo Boleto");
        }
    }

}