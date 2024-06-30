package secao09.dadosProduto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    double valorNoEstoque() {
        return preco * quantidade;
    }
    void adicionarProd(int quantidade) {
        this.quantidade += quantidade;
    }
    void removerProd(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome + ", R$" + String.format("%.2f", preco) + ", " + quantidade + " em estoque e valor do estoque R$" + valorNoEstoque();
    }
}
