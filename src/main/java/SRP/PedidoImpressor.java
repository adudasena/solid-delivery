package SRP;

public class PedidoImpressor {
    // Responsabilidade: Exibir os dados formatados na tela

    public void exibirInformacoes(Pedido pedido) {
        System.out.println("\n=== DETALHES DO PEDIDO (SRP) ===");
        System.out.println("ID do Pedido: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Itens do Pedido:");

        // Percorre a lista de strings enviada
        for (String item : pedido.getItens()) {
            System.out.println(" - " + item);
        }
        System.out.println("Total: R$ " + pedido.getTotal());
        System.out.println("================================");
    }
}

