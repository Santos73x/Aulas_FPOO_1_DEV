/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

import com.sun.tools.javac.Main;

/**
 *
 * @author Aluno
 */
public class Curso {
    public static void main(String[] args) {
        
    
    atividade03 cursin = new atividade03("DEV", "curso tecnico muito bom com curso de nuvem fica melhor ainda", Enumcategoria.DEV_TECNICO);
        System.out.println(cursin);
        atividade03 cursin2 = new atividade03("Marcenaria", "curso para progetar moveis ", Enumcategoria.MARCENARIA);
        System.out.println(cursin2);
        atividade03 cursin3 = new atividade03("Solda", "soldar moveis", Enumcategoria.SOLDA);
        System.out.println(cursin3);
    }             
}
