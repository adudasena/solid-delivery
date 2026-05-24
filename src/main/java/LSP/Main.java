package LSP;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Teste LSP---");

        List<Produto> cardapio = new ArrayList<>();

        // Adicionando as subclasses normalmente (Substituição de Liskov)
        cardapio.add(new Pizza("Frango e Bacon", 49.90));
        cardapio.add(new Hamburguer("Duplo Smash", 34.50));
        cardapio.add(new Bebida("Suco Natural de Abacaxi", 9.00));

        for (Produto produto : cardapio) {
            produto.exibirDetalhes();
        }
    }
}