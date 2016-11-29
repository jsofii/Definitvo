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
public class Habitacion extends Cuarto{
    private int capacidad;
    private int estado;

    public Habitacion(int capacidad, int estado, int numero, Piso piso) {
        super(numero, piso);
        this.capacidad = capacidad;
        this.estado = estado;
    }
   

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public Habitacion(int numero,Piso piso){
        super(numero,piso);
        this.capacidad=2;
    }
    
}
