package atividade01.classes;

public class calcularMedia {
    public static void main(String[] args) {
        alunos a1 = new alunos("aluno01", "a1@gmail", "a32131", 9, 9, 1);
        int media = a1.media();
        System.out.println("A media " + media);
    }
}
