package LSP;

public class Pizza extends Produto {
    public Pizza(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("[PIZZA] " + nome + " | Preço: R$ " + preco);
        }
    }

