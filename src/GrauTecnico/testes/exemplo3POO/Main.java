package GrauTecnico.testes.exemplo3POO;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aluno i = new Aluno("Jose Francisco", "123.456.789-00", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
        System.out.println("CPF: " + i.cpf);
        System.out.println("Data de nascimento: " + i.data_nascimento.toString());
    }
}
