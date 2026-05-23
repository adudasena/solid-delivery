package OCP;

public class PagamentoPix implements FormaPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via PIX. Gerando QR Code...");
    }
}