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
public class TVTCL extends TV implements IControleRemoto {
//Constante
    public final String MODELO = "TCL";
//Construtores
    public TVTCL() {
    }
    public TVTCL(int tamanho) {
        super(tamanho);
    }
//Métodos
    @Override
    public void mudarCanal(int canal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void aumentarVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void diminuirVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean ligar() {
        System.out.println("Bem Vindo...");
        super.setLigada(true);
        return true;
    }
    @Override
    public boolean desligar() {
        System.out.println("Até mais...");
        super.setLigada(false);
        return false;
    }
}
