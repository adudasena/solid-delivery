package ISP;

public class ServicoRelatorio implements Relatorivel {
    @Override
    public void gerarRelatorioFaturamento() {
        System.out.println("Gerando relatório de faturamento...");
    }
}