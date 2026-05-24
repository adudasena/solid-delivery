package ISP;

public class ServicoNotificacao implements Notificavel {
    @Override
    public void enviarNotificacaoCliente(String mensagem) {
        System.out.println("Notificação enviada ao cliente: " + mensagem);
    }
}