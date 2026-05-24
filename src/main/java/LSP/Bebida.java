package LSP;

public class Bebida extends Produto {
    public Bebida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("[BEBIDA] " + nome + " - Gelada | Preço: R$ " + preco);
    }
}