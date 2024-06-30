package secao09.cadastroContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Conta conta;

        System.out.println("DADOS CADASTRAIS");
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite seu nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.print("\nDeseja fazer um depósito inicial?\n[s]: Sim\n[n]: Não\nDigite aqui: ");
        double saldo;
        String acao = scanner.next();
        if (acao.charAt(0) == 's') {
            System.out.print("Informe o saldo inicial: ");
            saldo = scanner.nextDouble();
            conta = new Conta(numero, nome, saldo);
        } else {
            conta = new Conta(numero, nome);
        }
        System.out.println("\nDADOS DA CONTA:\n" + conta);

        System.out.print("\nDeseja realizar um depósito?\n[s]: Sim\n[n]: Não\nDigite aqui: ");
        acao = scanner.next();
        if (acao.charAt(0) == 's') {
            System.out.print("Qual o valor do depósito: ");
            conta.depositar(scanner.nextDouble());

            System.out.println("Saldo atualizado: " + conta.getSaldo());
        }

        System.out.print("\nDeseja realizar um saque?\n[s]: Sim\n[n]: Não\nDigite aqui: ");
        acao = scanner.next();
        if (acao.charAt(0) == 's') {
            System.out.print("Qual o valor do saque: ");
            conta.sacar(scanner.nextDouble());

            System.out.println("Saldo atualizado: " + conta.getSaldo());
        }

        System.out.print("\nDeseja alterar seu nome?\n[s]: Sim\n[n]: Não\nDigite aqui: ");
        acao = scanner.next();
        if (acao.charAt(0) == 's') {
            System.out.print("Digite o novo nome: ");
            scanner.nextLine();
            conta.setTitular(scanner.nextLine());
        }

        System.out.println("\nDADOS DA CONTA:\n" + conta);

        scanner.close();
    }
}
