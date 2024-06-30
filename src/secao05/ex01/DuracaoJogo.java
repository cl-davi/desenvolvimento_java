package secao05.ex01;

import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = scanner.nextInt();
        System.out.print("Hora final: ");
        int horaFinal = scanner.nextInt();

        int duracaoJogo;

        if (horaInicial < horaFinal) {
            duracaoJogo = horaFinal - horaInicial;
        } else {
            duracaoJogo =  24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU: " + duracaoJogo + " HORA(S)");
        scanner.close();
    }
}
