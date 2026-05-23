package OCP;

public class PagamentoDinheiro implements FormaPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " em Dinheiro. Separar troco se necessário.");
    }
}