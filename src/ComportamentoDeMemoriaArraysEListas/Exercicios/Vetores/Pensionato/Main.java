package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores.Pensionato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante estudante;

        System.out.print("Quantos quartos serão alugados: ");
        int qtdQuartos = scanner.nextInt();
        Estudante[] vetor = new Estudante[9];

        for (int i = 0; i < qtdQuartos; i++) {
            System.out.println(STR."Aluguel #\{i + 1}:");

            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("E-mail: ");
            String email = scanner.nextLine();

            System.out.print("Quarto(1 a 9): ");
            int quarto = scanner.nextInt() - 1;

            vetor[quarto] = new Estudante(nome, email);
        }
        System.out.println("\nQUARTOS ALUGADOS:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println(STR."\{i}: \{vetor[i]}");
            }
        }
        scanner.close();
    }
}
