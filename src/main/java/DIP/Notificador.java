package DIP;

public interface Notificador {
    // Abstração que permite a inversão de dependência
    void enviar(String mensagem);
}