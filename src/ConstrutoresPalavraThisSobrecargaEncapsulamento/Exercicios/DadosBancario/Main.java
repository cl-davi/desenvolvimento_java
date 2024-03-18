package ConstrutoresPalavraThisSobrecargaEncapsulamento.Exercicios.DadosBancario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        BankData bankData;

        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();
        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String accHolder = scanner.nextLine();
        System.out.print("Is there na initial deposit (y/n): ");
        char initialDeposit = scanner.next().charAt(0);

        if (initialDeposit == 'y' ) {
            System.out.print("Enter a initial deposit value: ");
            double initialValue = scanner.nextDouble();

            bankData = new BankData(accNum, accHolder, initialValue);
        } else {
            bankData = new BankData(accNum, accHolder);
        }
        System.out.println("\n" + bankData);

        System.out.print("Enter deposit value: ");
        double depositValue = scanner.nextDouble();

        bankData.deposit(depositValue);
        System.out.println("\nUpdated account data: \n" + bankData);

        System.out.print("Enter withdraw value: ");
        double withdrawValue = scanner.nextDouble();

        bankData.withdraw(withdrawValue);
        System.out.println("\nUpdated account data: \n" + bankData);

        scanner.close();
    }
}
