package secao09.dadosProduto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Produto produto;

        System.out.println("Insira os dados do produto");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        produto = new Produto(nome, preco);
        System.out.println("Dados do produto: " + produto);

        produto.setNome("Computador");
        System.out.println("Nome atualizado: " + produto.getNome());
        System.out.println("Dados do produto: " + produto);

        produto.setPreco(1200d);
        System.out.println("Preço atualizado: R$" + produto.getPreco());
        System.out.println("Dados do produto: " + produto);

        System.out.print("\nInsira o quantidade de produtos para adicionar ao estoque: ");
        produto.adicionarProd(scanner.nextInt());
        System.out.println("Quantidade no estoque atualizado: " + produto.getQuantidade());

        System.out.print("\nInsira o quantidade de produtos para remover do estoque: ");
        produto.removerProd(scanner.nextInt());
        System.out.println("Quantidade no estoque atualizado: " + produto.getQuantidade());

        scanner.close();
    }
}
