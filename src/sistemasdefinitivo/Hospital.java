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
public class Hospital {
    private String nombre;
    private int capacidad;
    private String calificacion;
    private Direccion direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void setHospital(String nombre,String calificacion,int capacidad,String principal,String secundaria,String numero){
        this.nombre=nombre;
        this.calificacion=calificacion;
        this.capacidad=capacidad;
        this.direccion.setDireccion(principal,secundaria,numero);
    }
    
    public Hospital(){
        this.nombre="\n-HOSPITAL DE LA ESCUELA POLITÉCNICA NACIONAL-";
        this.capacidad=30;
        this.calificacion="A+";
        this.direccion=new Direccion();
    }
}
