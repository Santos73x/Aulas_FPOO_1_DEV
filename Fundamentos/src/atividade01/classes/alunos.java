package atividade01.classes;

public class alunos {
private String nome;
private String email;
private String ra;
private int nota1; 
private int media;
private int nota2; 
private int nota3; 

    public alunos(String nome, String email, String ra, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
public int media() {
    this.media = (this.nota1 +this.nota2) / 2;
    return this.media;
}
}
