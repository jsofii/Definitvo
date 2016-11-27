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
public class Seguro {
    public double cubierto;

    public double getCubierto() {
        return cubierto;
    }

    public void setCubierto(double cubierto) {
        this.cubierto = cubierto;
    }
    
    public Seguro(){
        this.cubierto=0.80;
    }
    
}
