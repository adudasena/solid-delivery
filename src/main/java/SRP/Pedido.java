package SRP;

import java.util.List;

public class Pedido {

    private int id;
    private String cliente;
    private List<String> itens;
    private double total;

    public Pedido(int id, String cliente, List<String> itens, double total) {
        this.id = id;
        this.cliente = cliente;
        this.itens = itens;
        this.total = total;
        this.total = total;
    }

    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public List<String> getItens() { return itens; }
    public double getTotal() { return total; }
}
