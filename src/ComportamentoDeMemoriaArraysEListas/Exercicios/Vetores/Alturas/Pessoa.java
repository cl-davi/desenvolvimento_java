package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores.Alturas;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {}

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() +"\nAltura: " + getAltura();
    }
}
