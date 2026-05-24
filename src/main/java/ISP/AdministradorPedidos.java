package ISP;

public class AdministradorPedidos implements GerenciadorPedidos {
    @Override
    public void processarPedido() {
        System.out.println("Pedido recebido, preparando...");
    }
}