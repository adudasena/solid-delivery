package DIP;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Teste DIP---");

        String statusAtual = "Saindo para entrega!";

        // Testando a inversão de dependência injetando o WhatsApp
        System.out.println("--- Cenário 1 ---");
        ServicoNotificacoes notificacaoWhats = new ServicoNotificacoes(new EnvioWhatsApp());
        notificacaoWhats.notificarStatusPedido(statusAtual);

        // Mudando o canal para SMS
        System.out.println("\n--- Cenário 2 ---");
        ServicoNotificacoes notificacaoSMS = new ServicoNotificacoes(new EnvioSMS());
        notificacaoSMS.notificarStatusPedido(statusAtual);

        // Mudando para E-mail
        System.out.println("\n--- Cenário 3 ---");
        ServicoNotificacoes notificacaoEmail = new ServicoNotificacoes(new EnvioEmail());
        notificacaoEmail.notificarStatusPedido(statusAtual);
    }
}