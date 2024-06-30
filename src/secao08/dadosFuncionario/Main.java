package secao08.dadosFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Empregado empregado = new Empregado();

        System.out.print("Nome: ");
        empregado.nome = scanner.nextLine();

        System.out.print("Salário bruto: ");
        empregado.salarioBruto = scanner.nextDouble();

        System.out.print("Imposto: ");
        empregado.imposto = scanner.nextDouble();

        System.out.println("Empregado: " + empregado);

        System.out.print("\nPorcentagem de aumento de salário: ");
        empregado.aumentarSalario(scanner.nextDouble());

        System.out.println("Dados atualizados: " + empregado);
    }
}
