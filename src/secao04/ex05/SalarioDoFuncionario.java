package secao04.ex05;

import java.util.Locale;
import java.util.Scanner;

public class SalarioDoFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Número do funcionário: ");
        int numFunc = scanner.nextInt();
        System.out.print("Horas trabalhadas: ");
        int horasTrab = scanner.nextInt();
        System.out.print("Valor por hora: ");
        double valorHora = scanner.nextDouble();

        double salario = horasTrab * valorHora;

        System.out.println("NÚMERO: " + numFunc);
        System.out.printf("SALÁRIO: " + String.format("%.2f", salario));
    }
}
