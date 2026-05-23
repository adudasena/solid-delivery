package OCP;

    public interface FormaPagamento {
        // Permite que o sistema seja estendido com novas formas de pagamento sem alterar o código existente
        void processar(double valor);
    }

