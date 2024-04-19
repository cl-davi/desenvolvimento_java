package EstruturaRepetitiva.Exercicios.While;

import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = "2002";

        System.out.print("Digite a senha: ");
        String senhaInserida = scanner.next();

        while (!senhaInserida.equals(senha)) {
            System.out.println("Senha Inválida");

            System.out.print("Digite a senha corretamente: ");
            senhaInserida = scanner.next();
        }
        System.out.println("Acesso permitido");
    }
}
