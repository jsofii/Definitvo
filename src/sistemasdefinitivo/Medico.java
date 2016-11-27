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

    public String getEspecialidad() {
        return especialidad;
    }
    
    public Medico(String Especialidad, String Nombre) {
        super(Nombre);
        this.especialidad = Especialidad;
    }

    public Medico(String especialidad) {
        this.especialidad = especialidad;
    }


   
    
}
