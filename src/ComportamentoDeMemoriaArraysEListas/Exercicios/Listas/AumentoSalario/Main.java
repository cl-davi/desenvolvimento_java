package ComportamentoDeMemoriaArraysEListas.Exercicios.Listas.AumentoSalario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario;

        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados: ");
        int qtdFunc = scanner.nextInt();

        for (int i = 0; i < qtdFunc; i++) {
            System.out.println(STR."Dados do \{i + 1}º funcionário:");
            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            funcionario = new Funcionario(id, nome, salario);
            lista.add(funcionario);
        }
        System.out.print("\nInforme o funcionário que dará o aumento: ");
        int idSalario = scanner.nextInt();
        Integer posicao = positionFunction(lista, idSalario);
        if (posicao == null) {
            System.out.println("Este ID não existe.");
        } else {
            System.out.print("Informe a porcentargem: ");
            double porcentagem = scanner.nextDouble();
            double totalAumento = lista.get(posicao).getSalario() * (porcentagem / 100);
            lista.get(posicao).increaseSalary(totalAumento);
        }

        System.out.println("\nLista dos Funcionários: ");
        for (Funcionario value : lista) {
            System.out.println(value);
        }
    }

    public static Integer positionFunction(List<Funcionario> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
