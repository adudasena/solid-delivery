package SRP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instância as classes de responsabilidade única
        PedidoServico servico = new PedidoServico();
        PedidoRepositorio repositorio = new PedidoRepositorio();
        PedidoImpressor impressor = new PedidoImpressor();

        // Cria a lista de itens
        List<String> itensDelivery = new ArrayList<>();
        itensDelivery.add("Pizza de Calabresa");
        itensDelivery.add("Coca-Cola 2L");

        // Executa o fluxo
        Pedido novoPedido = servico.criarPedido(1, "Maria Clara", itensDelivery, 65.90);

        // Salva e exibe as informações
        repositorio.salvar(novoPedido);
        impressor.exibirInformacoes(novoPedido);
    }
}