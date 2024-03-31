package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores;

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores seraõ digitados: ");
        double[] vetor = new double[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(STR."Digite o \{i + 1}º valor: ");
            vetor[i] = scanner.nextDouble();
        }
        double maior = vetor[0];
        int posicaoMaior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }
        System.out.println(STR."\nMAIOR VALOR: \{maior}");
        System.out.println(STR."POSIÇÃO DO MAIOR VALOR: \{posicaoMaior}");

        scanner.close();
    }
}
