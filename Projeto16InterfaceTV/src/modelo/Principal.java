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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TVSharp objTVSharp = new TVSharp(14);
        TVPhilips objTVPhilips = new TVPhilips(32);
        TVTCL objTVTCL = new TVTCL(60);
        
        objTVPhilips.ligar();
        //objTVSharp.ligar();
                
        System.out.print("TVPhilips - modelo: "+objTVPhilips.MODELO+" está: ");
        System.out.println(objTVPhilips.isLigada() ?"ligada":"desligada"); //If-Else declarado
        
        objTVTCL.ligar();
        
        System.out.print("TVTCL - modelo: "+objTVTCL.MODELO+" está: ");
        System.out.println(objTVTCL.isLigada() ?"ligada":"desligada"); //If-Else declarado
        
        objTVTCL.desligar();
    }    
}
