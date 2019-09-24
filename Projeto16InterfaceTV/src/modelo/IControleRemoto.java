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
public interface IControleRemoto {
//Interface possui apenas a assinatura (declaração) dos métodos -
//e a implementação dos métodos estará nas classes que "assinarem"
//o contrato com a interface, obrigatoriamente todos metodos declarados
//na interface deverão ser implementados nas classes que assinaram os contratos
    
    public void mudarCanal(int canal);
    public void aumentarVolume(int volume);
    public void diminuirVolume(int volume);
    public boolean ligar();
    public boolean desligar();
}
