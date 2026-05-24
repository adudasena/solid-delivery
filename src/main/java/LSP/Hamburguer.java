package LSP;

public class Hamburguer extends Produto {
    public Hamburguer(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("[HAMBÚRGUER] " + nome + " - artesanal | Preço: R$ " + preco);
    }
}