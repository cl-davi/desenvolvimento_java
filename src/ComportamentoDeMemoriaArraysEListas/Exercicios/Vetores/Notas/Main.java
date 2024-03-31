package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores.Notas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Aluno aluno;

        System.out.print("Quantos alunos serão preenchidos: ");
        Aluno[] vetor = new Aluno[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(STR."\nDigite os dados do \{i + 1}º aluno:");
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("NOta 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("NOta 2: ");
            double nota2 = scanner.nextDouble();

            aluno = new Aluno(nome, nota1, nota2);
            vetor[i] = aluno;
        }

        for (int i = 0; i< vetor.length; i++) {
            vetor[i].setMedia((vetor[i].getNota1() + vetor[i].getNota2()) / 2);
        }

        int mediaGeral = 6;
        System.out.println("\nALUNOS APROVADOS:");
        for (Aluno i : vetor) {
            if (i.getMedia() >= mediaGeral) {
                System.out.println(i.getNome());
            }
        }
    }
}
