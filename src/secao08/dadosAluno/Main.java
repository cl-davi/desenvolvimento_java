package secao08.dadosAluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Nota 1: ");
        aluno.nota1 = scanner.nextFloat();

        System.out.print("Nota 2: ");
        aluno.nota2 = scanner.nextFloat();

        System.out.print("Nota 3: ");
        aluno.nota3 = scanner.nextFloat();

        double grade1 = (aluno.nota1 * 30 + aluno.nota2 * 30 + aluno.nota3 * 30) / 30;
        double grade2 = (aluno.nota1 * 35 + aluno.nota2 * 35 + aluno.nota3 * 35) / 35;
        double grade3 = (aluno.nota1 * 35 + aluno.nota2 * 35 + aluno.nota3 * 35) / 35;

        double media = (grade1 + grade2 + grade3) / 3;

        System.out.println(aluno.checagemFinal(media));
    }
}
