/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdefinitivo;

/**
 *
 * @author USER
 */
public class Cuarto {
    private int numero;
    private Piso piso;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }

    
    public Cuarto(int numero,Piso piso){
        this.numero=numero+100;
        this.piso=piso;
    }
    
    public Cuarto(){
        
    }

}
