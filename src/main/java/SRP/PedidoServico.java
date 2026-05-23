package SRP;

import java.util.List;

public class PedidoServico {
    // Responsabilidade: Lógica de negócio e instanciação do pedido

    public Pedido criarPedido(int id, String cliente, List<String> itens, double total) {
        if (itens == null || itens.isEmpty()) {
            throw new IllegalArgumentException("O pedido deve conter pelo menos um item.");
        }
        if (total <= 0) {
            throw new IllegalArgumentException("O valor total do pedido deve ser maior que zero.");
        }
        return new Pedido(id, cliente, itens, total);
    }
}
