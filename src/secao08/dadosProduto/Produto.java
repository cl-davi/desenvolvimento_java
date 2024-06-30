package secao08.dadosProduto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

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
