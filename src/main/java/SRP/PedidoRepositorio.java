package SRP;

public class PedidoRepositorio {
    // Responsabilidade: Simular salvar no banco de dados

    public void salvar(Pedido pedido) {
        System.out.println("Salvando o pedido número " + pedido.getId() + " no banco de dados...");
    }
}

