package ISP;

public class AdministradorEntregas implements GerenciadorEntregas {
    @Override
    public void despacharEntrega() {
        System.out.println("Pedido pronto colocado na mochila do entregador.");
    }
}