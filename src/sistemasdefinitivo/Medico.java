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
public class Medico extends Persona {
    private String especialidad;
    private Oficina oficina;
    private int estado;
    
    public int getEstado(){
        return this.estado;
    }
    
    public String getEstado(int a) {
        String estado1="";
        switch(this.estado){
            case 0:
                estado1="Desocupado";
                break;
            case 1:
                estado1="Ocupado";
                break;
        }
        return estado1;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
 
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
    
    public Medico(Oficina oficina){
        this.especialidad="General";
        this.oficina=oficina;
        this.estado=0;
    }
    
    public Medico(){
        this.estado=0;
    }
}

