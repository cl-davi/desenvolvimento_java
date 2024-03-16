package EstruturaCondicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class valorLanche {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do item: ");
        int cod = scanner.nextByte();
        System.out.print("Informe a quantidade: ");
        int qtdLanche = scanner.nextInt();

        String nomeLanche;
        double precoLanche, totalAPagar;

        if (cod == 1) {
            nomeLanche = "Cachorro Quente";
            precoLanche = 4.00;
            totalAPagar = precoLanche * qtdLanche;
            System.out.printf("TOTAL: R$ %.2f", totalAPagar);
        } else if (cod == 2) {
            nomeLanche = "X-Salada";
            precoLanche = 4.50;
            totalAPagar = precoLanche * qtdLanche;
            System.out.printf("TOTAL: R$ %.2f", totalAPagar);
        } else if (cod == 3) {
            nomeLanche = "X-Bacon";
            precoLanche = 5.00;
            totalAPagar = precoLanche * qtdLanche;
            System.out.printf("TOTAL: R$ %.2f", totalAPagar);
        } else if (cod == 4) {
            nomeLanche = "Torrada Simples";
            precoLanche = 2.00;
            totalAPagar = precoLanche * qtdLanche;
            System.out.printf("TOTAL: R$ %.2f", totalAPagar);
        } else if (cod == 5) {
            nomeLanche = "Refrigerante";
            precoLanche = 1.50;
            totalAPagar = precoLanche * qtdLanche;
            System.out.printf("TOTAL: R$ %.2f", totalAPagar);
        }
        scanner.close();
    }
}
