package DIP;

public class ServicoNotificacoes {
    // Depende da interface, não da implementação
    private final Notificador notificador;

    // A dependência é injetada via construtor
    public ServicoNotificacoes(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificarStatusPedido(String status) {
        String msgFormatada = "Status Delivery- Seu pedido está: " + status;
        notificador.enviar(msgFormatada);
    }
}