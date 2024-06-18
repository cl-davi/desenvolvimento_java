package GrauTecnico.testes.exemplo3POO;

import java.util.Date;

public class Aluno extends Pessoa {
    public Aluno(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }

    public String matricula;

    public final double tirarCopias(int qtd) { //Retorna o preço para tirar copias
        return 0.10 * (double) qtd;
    }
}
