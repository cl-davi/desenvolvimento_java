package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores.AlturaFeminina;

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
            System.out.println(STR."Dados da \{i + 1}º pessoa:");
            System.out.print("Altura: ");
            double atura = scanner.nextDouble();

            System.out.print("Gênero(M ou F): ");
            char genero = scanner.next().toLowerCase().charAt(0);

            pessoa = new Pessoa(atura, genero);
            vetor[i] = pessoa;
        }
        double maior = vetor[0].getAltura();
        for (Pessoa value : vetor) {
            if (value.getAltura() > maior) {
                maior = value.getAltura();
            }
        }
        double menor = vetor[0].getAltura();
        for (Pessoa value : vetor) {
            if (value.getAltura() < menor) {
                menor = value.getAltura();
            }
        }
        double soma = 0;
        int contadorM = 0;
        int contadorH = 0;
        double media;
        for (Pessoa value : vetor) {
            if (value.getGenero() == 'f') {
                soma += value.getAltura();
                contadorM++;
            } else {
                contadorH++;
            }
        }
        media = soma / contadorM;

        System.out.println(STR."\nMAIOR ALTURA: \{maior}");
        System.out.println(STR."MENOR ALTURA: \{menor}");
        System.out.printf("MÉDIA DAS ALTURAS DAS MULHERES: %.2f", media);
        System.out.println(STR."\nNÚMERO DE HOMENS: \{contadorH}");

        scanner.close();
    }
}
