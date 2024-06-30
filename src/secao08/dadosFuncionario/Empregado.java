package secao08.dadosFuncionario;

public class Empregado {
    String nome;
    double salarioBruto;
    double imposto;

    double salarioLiquido() {
        return salarioBruto - imposto;
    }
    void aumentarSalario(double porcentagem) {
        salarioBruto += (salarioBruto * (porcentagem / 100));
    }

    @Override
    public String toString() {
        return nome + ", R$" + String.format("%.2f", salarioLiquido());
    }
}
