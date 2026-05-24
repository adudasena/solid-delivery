package DIP;

public class EnvioWhatsApp implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("WhatsApp enviado ao cliente: " + mensagem);
    }
}