/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracaoatividade;

/**
 *
 * @author Aluno
 */
public class Cantina {
    private EnumCantina cantina; 

    @Override
    public String toString() {
        return "Cantina{" + "cantina=" + cantina + '}';
    }

    public Cantina(EnumCantina cantina) {
        this.cantina = cantina;
    }
}
