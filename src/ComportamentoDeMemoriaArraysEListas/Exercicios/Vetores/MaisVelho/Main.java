package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores.MaisVelho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa;

        System.out.print("Quantas pessoas serão digitadas: ");
        Pessoa[] vetor = new Pessoa[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(STR."\nDigite os dados da \{i + 1}º pessoa: ");
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.next();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            pessoa = new Pessoa(nome, idade);
            vetor[i] = pessoa;
        }

        int maiorIdade = vetor[0].getIdade();
        int posicaoMaior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() > maiorIdade) {
                maiorIdade = vetor[i].getIdade();
                posicaoMaior = i;
            }
        }
        System.out.println(STR."\nPESSOA MAIS VELHA: \{vetor[posicaoMaior].getNome()}");

        scanner.close();
    }
}
