/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class TVSharp extends TV {
//Constante em JAVA - por convenção utilizamos o nome do atributo em maiúsculo.
    public final String MODELO = "SHARP";
//Construtores
    public TVSharp() {
    }
    public TVSharp(int tamanho) {
        super(tamanho);
    }
}
