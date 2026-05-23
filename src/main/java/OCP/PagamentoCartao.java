package OCP;

public class PagamentoCartao implements FormaPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via Cartão de Crédito/Débito.");
    }
}
