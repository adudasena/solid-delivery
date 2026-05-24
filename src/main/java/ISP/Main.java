package ISP;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Teste ISP---");

        // Cada classe executa apenas a sua responsabilidade e interface assinada
        GerenciadorPedidos cozinha = new AdministradorPedidos();
        cozinha.processarPedido();

        GerenciadorEntregas expedicao = new AdministradorEntregas();
        expedicao.despacharEntrega();

        Notificavel centralNotificacoes = new ServicoNotificacao();
        centralNotificacoes.enviarNotificacaoCliente("Seu pedido foi aprovado!");

        Relatorivel financeiro = new ServicoRelatorio();
        financeiro.gerarRelatorioFaturamento();
    }
}