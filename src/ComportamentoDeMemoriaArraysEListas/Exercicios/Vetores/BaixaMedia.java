package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class BaixaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores serão digitados: ");
        double[] vetor = new double[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(STR."Informe o \{i + 1}º valor: ");
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double i : vetor) {
            soma += i;
        }

        double media = soma / vetor.length;
        System.out.println(STR."MÉDIA DO VETOR: \{media}");

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (double i : vetor) {
            if (media > i) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
