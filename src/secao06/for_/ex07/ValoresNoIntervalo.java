package secao06.for_.ex07;

import java.util.Scanner;

public class ValoresNoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor inicial: ");
        int n = scanner.nextInt();

        int dentroDoIntervalo = 0;
        int foraDoIntervalo = 0;
        int valor = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            valor =  scanner.nextInt();

            if (valor > 9 && valor < 21) {
                dentroDoIntervalo += 1;
            } else {
                foraDoIntervalo += 1;
            }
        }
        System.out.println(dentroDoIntervalo + " in");
        System.out.println(foraDoIntervalo + " out");

        scanner.close();
    }
}
