package IntroducaoAProgramacaoOrientadaAObjetos.Exercicios.NotasGradeAluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.name = scanner.nextLine();
        System.out.print("Nota grade 1: ");
        student.grade1 = scanner.nextDouble();
        System.out.print("Nota grade 2: ");
        student.grade2 = scanner.nextDouble();
        System.out.print("Nota grade 3: ");
        student.grade3 = scanner.nextDouble();

        System.out.printf("\nFINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        scanner.close();
    }
}
