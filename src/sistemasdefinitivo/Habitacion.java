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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getEstado() {
        return estado;
    }
    
    public String getEstado(int a){
        String estado1="";
        switch(this.estado){
            case 0:
                estado1="vacia";
                break;
            case 1:
                estado1="ocupada";
                break;
            case 2:
                estado1="llena";
                break;               
        }
        return estado1;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public Habitacion(int numero,Piso piso){
        super(numero,piso);
        this.capacidad=2;
    }
    public Habitacion(){
        this.capacidad=2;
        this.estado=0;
        
    }
}
