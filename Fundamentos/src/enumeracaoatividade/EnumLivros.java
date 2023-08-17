/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracaoatividade;

/**
 *
 * @author Aluno
 */
public class EnumLivros {
    private Livros livros;

    @Override
    public String toString() {
        return "EnumLivros{" + "livros=" + livros + '}';
    }

    public EnumLivros(Livros livros) {
        this.livros = livros;
    }
}
