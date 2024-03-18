package IntroducaoAProgramacaoOrientadaAObjetos.Exercicios.DadosFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        employee.netSalary();
        System.out.println("Employee: " + employee);

        System.out.print("\nWhich percentage to increase salary: ");
        double percent = scanner.nextDouble();
        employee.increaseSalary(percent);

        System.out.println("Updated data: " + employee);

        scanner.close();
    }
}
