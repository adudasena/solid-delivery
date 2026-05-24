# Atividade: Aplicando os Princípios SOLID no Sistema de Delivery

Este repositório contém a implementação prática dos 5 princípios do **SOLID**, desenvolvida como atividade acadêmica. 
O projeto simula diferentes fluxos de um sistema de delivery, onde cada princípio foi isolado em seu próprio pacote com um ponto de entrada (`Main.java`) independente para facilitar os testes e a avaliação.

---
## Tecnologias Utilizadas
* **Java 17**
* **Maven** (Gerenciador de Dependências e Build)
* **IntelliJ IDEA** (Ambiente de Desenvolvimento)
---

## 🛠️ Estrutura do Projeto e Princípios Aplicados

### 1. Single Responsibility Principle (SRP) — Princípio da Responsabilidade Única
**Contexto:** Gerenciamento de Pedidos.
A responsabilidade de manipular um pedido foi dividida em classes distintas para garantir que cada uma tenha apenas um motivo para mudar:
* `Pedido`: Classe de modelo que apenas representa os dados do pedido.
* `PedidoServico`: Contém as regras de negócio e validações para a criação do pedido.
* `PedidoRepositorio`: Responsável exclusiva por simular a persistência no banco de dados.
* `PedidoImpressor`: Cuida apenas da formatação e exibição dos dados no console.

### 2. Open/Closed Principle (OCP) — Princípio Aberto/Fechado
**Contexto:** Formas de Pagamento.
O sistema foi projetado para ser aberto para expansão, mas fechado para modificação.
* Criou-se a interface `FormaPagamento`.
* As classes `PagamentoPix`, `PagamentoCartao` e `PagamentoDinheiro` implementam essa interface.
* Novas formas de pagamento podem ser adicionadas futuramente criando apenas uma nova classe, sem a necessidade de alterar as lógicas já existentes ou usar estruturas de `switch/case` e `if/else` complexas.

### 3. Liskov Substitution Principle (LSP) — Princípio da Substituição de Liskov
**Contexto:** Produtos do Restaurante.
Garante que as classes derivadas possam substituir totalmente a classe base sem quebrar o comportamento do sistema.
* `Produto` funciona como a classe base.
* Subclasses como `Pizza`, `Hamburguer` e `Bebida` herdam de `Produto` e estendem o comportamento do método `exibirDetalhes()` de forma previsível e segura, permitindo o polimorfismo harmônico.

### 4. Interface Segregation Principle (ISP) — Princípio da Segregação de Interfaces
**Contexto:** Operações e Perfis do Sistema.
Interfaces pequenas e específicas foram criadas para evitar que classes sejam forçadas a implementar métodos que não utilizam.
* O sistema utiliza interfaces focadas em tarefas: `Notificavel`, `Relatorivel`, `GerenciadorPedidos` e `GerenciadorEntregas`.
* Classes como `AdministradorPedidos` (Cozinha) e `AdministradorEntregas` (Expedição) assinam estritamente o comportamento que executam no fluxo.

### 5. Dependency Inversion Principle (DIP) — Princípio da Inversão de Dependência
**Contexto:** Sistema de Notificações ao Cliente.
Módulos de alto nível não dependem de módulos de baixo nível, mas sim de abstrações.
* O `ServicoNotificacoes` depende exclusivamente da interface `Notificador` (abstração).
* As implementações de canais de envio (`EnvioEmail`, `EnvioSMS`, `EnvioWhatsApp`) são injetadas dinamicamente via construtor, deixando a arquitetura completamente desacoplada de ferramentas de entrega de terceiros.

---

## 💻 Como Executar os Testes

Cada princípio possui sua própria classe de testes `Main.java` dentro de seu respectivo pacote. Para testar o comportamento isolado de um princípio:

1. Abra o projeto na sua IDE (recomendado IntelliJ IDEA).
2. Navegue até o pacote correspondente ao princípio desejado (ex: `src/main/java/SRP/`).
3. Abra o arquivo `Main.java` correspondente.
4. Clique no botão **Run** (ícone de play verde) para visualizar o output formatado no console.