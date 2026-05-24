package DIP;

public class EnvioEmail implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("E-mail enviado ao cliente: " + mensagem);
    }
}