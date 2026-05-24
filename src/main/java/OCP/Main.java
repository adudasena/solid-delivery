package OCP;

public class Main {
    // aceita qualquer FormaPagamento sem precisar de estruturas de if e else ou switch
    public static void realizarPagamento(FormaPagamento formaPagamento, double valor) {
        formaPagamento.processar(valor);
    }

    public static void main(String[] args) {
        double valorTotalPedido = 84.50;

        // Testando pagamento com PIX
        FormaPagamento pix = new PagamentoPix();
        realizarPagamento(pix, valorTotalPedido);

        // Testando pagamento com Cartão
        FormaPagamento cartao = new PagamentoCartao();
        realizarPagamento(cartao, valorTotalPedido);

        // Testando pagamento com Dinheiro
        FormaPagamento dinheiro = new PagamentoDinheiro();
        realizarPagamento(dinheiro, valorTotalPedido);
    }
}
