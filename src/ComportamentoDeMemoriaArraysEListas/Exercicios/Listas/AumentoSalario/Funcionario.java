package ComportamentoDeMemoriaArraysEListas.Exercicios.Listas.AumentoSalario;

public class Funcionario {
    private final int id;
    private final String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void increaseSalary(double porcentagem) {
        salario += porcentagem;
    }

    @Override
    public String toString() {
        return STR."ID: \{getId()}, Nome: \{getNome()}, Salário: \{getSalario()}";
    }
}
