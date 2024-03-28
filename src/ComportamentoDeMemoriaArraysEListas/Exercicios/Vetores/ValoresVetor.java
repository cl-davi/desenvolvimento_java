package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ValoresVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números serão digitados: ");
        double[] vetor = new double[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(STR."Digite o \{i + 1}º valor: ");
            vetor[i] = scanner.nextDouble();
        }
        System.out.print("\nVALORES: ");

        for (double v : vetor) {
            System.out.printf(STR."\{v} ");
        }
        double soma = 0;

        for (double v : vetor) {
            soma += v;
        }
        System.out.printf("\nSOMA: %.2f", soma);

        double media = soma / vetor.length;
        System.out.printf("\nMÉDIA: %.2f", media);
    }
}
