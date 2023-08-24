/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class atividade03 {
    private String nome;
    private String descrição;
    private Enumcategoria categoria;

    public atividade03(String nome, String descrição, Enumcategoria categoria) {
        this.nome = nome;
        this.descrição = descrição;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "atividade03{" + "nome=" + nome + ", descri\u00e7\u00e3o=" + descrição + ", categoria=" + categoria + '}';
    }
    
}
