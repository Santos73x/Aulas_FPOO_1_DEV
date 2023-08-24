/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class aluno {
    private int media;
    private String nome;
    private String email;
    private int ra;

    public aluno(int media, String nome, String email, int ra) {
        this.media = media;
        this.nome = nome;
        this.email = email;
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "aluno{" + "media=" + media + ", nome=" + nome + ", email=" + email + ", ra=" + ra + '}';
    }
    
}
