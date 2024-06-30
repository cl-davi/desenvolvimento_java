package secao08.dadosAluno;

public class Aluno {
    String nome;
    float nota1, nota2, nota3;

    String checagemFinal(double media) {
        if (media > 60) {
            System.out.println("Grade final: " + media);
            return "Aprovado";
        } else {
            System.out.println("Grade final: " + media);
            System.out.println("Faltou " + (60 - media) + " pontos");
            return "Reprovado";
        }
    }
}
