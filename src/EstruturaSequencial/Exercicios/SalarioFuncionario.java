package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número do funcionário: ");
        int numFunc = scanner.nextInt();
        System.out.print("Horas trabalhadas: ");
        int horasTrab = scanner.nextInt();
        System.out.print("Valor por hora: ");
        double valorHora = scanner.nextDouble();

        double salario = horasTrab * valorHora;

        System.out.println("\nNÚMERO = " + numFunc);
        System.out.printf("SALÁRIO = %.2f", salario);
    }
}
