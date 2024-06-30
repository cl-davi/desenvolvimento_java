package secao08.dadosProduto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Produto produto = new Produto();

        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = scanner.nextLine();

        System.out.print("Preço: ");
        produto.preco = scanner.nextDouble();

        System.out.print("Quantidade no estoque: ");
        produto.quantidade = scanner.nextInt();

        System.out.println("Dados do produto: " + produto); // produto.toString()

        System.out.print("\nInsira o quantidade de produtos para adicionar ao estoque: ");
        produto.adicionarProd(scanner.nextInt());

        System.out.println("Dados atualizados: " + produto); // produto.toString()

        System.out.print("\nInsira o quantidade de produtos para remover do estoque: ");
        produto.removerProd(scanner.nextInt());

        System.out.println("Dados atualizados " + produto); // produto.toString()

        scanner.close();
    }
}
