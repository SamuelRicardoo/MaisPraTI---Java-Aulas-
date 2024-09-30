public class Pix extends FormaPagamento{


    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via PIX processado com sucesso no valor de: " + valor);
        validarPagamento(true);
    }

    @Override
    void validarPagamento(boolean isPagamento) {
       if(isPagamento){
           System.out.println("Pagamento via PIX validado com sucesso");
       }
    }
}
