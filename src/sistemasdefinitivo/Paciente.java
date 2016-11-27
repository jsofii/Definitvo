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
public class Paciente extends Persona{
    private String nombre;
     private int diagnostico;
     private Medico medico;
     private Turno turno;
     private Seguro seguro;
     private Receta receta;
     private double cuenta;

    @Override
    public String getNombre() {
        return nombre;
    }

    public Paciente(String nombre, int diagnostico, Medico medico, Turno turno, Seguro seguro, Receta receta, double cuenta) {
    
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.medico = medico;
        this.turno = turno;
        this.seguro = seguro;
        this.receta = receta;
        this.cuenta = cuenta;
    }

    
   

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(int diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }
    
    
    
    
}

