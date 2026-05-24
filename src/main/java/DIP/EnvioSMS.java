package DIP;

public class EnvioSMS implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado ao cliente: " + mensagem);
    }
}