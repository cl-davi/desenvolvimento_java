package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores.Alturas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa;

        System.out.print("Quantas pessoas serão digitadas: ");
        Pessoa[] vetor = new Pessoa[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(STR."\nInforme o nome da \{i + 1}º pessoa: ");
            String nome = scanner.next();

            System.out.print(STR."Informe a idade da \{i + 1}º pessoa: ");
            int idade = scanner.nextInt();

            System.out.print(STR."Informe a altura da \{i + 1}º pessoa: ");
            double altura = scanner.nextDouble();

            pessoa = new Pessoa(nome, idade, altura);
            vetor[i] = pessoa;
        }
        double media;
        double soma = 0;
        for (Pessoa value : vetor) {
            soma += value.getAltura();
        }
        media = soma / vetor.length;

        int contador = 0;
        for (Pessoa value : vetor) {
            if (value.getIdade() < 16) {
                System.out.println(value.getNome());
                contador++;
            }
        }
        double percetualMenores = ((double) contador / vetor.length) * 100;

        System.out.println(STR."Altura Média: \{media}");
        System.out.println(STR."Pessoas com menos de 16 anos: \{percetualMenores}%");

        scanner.close();
    }
}
