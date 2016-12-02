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
     private String diagnostico;
    private Medico medico;
    private Turno turno;
    private double seguro;
    private Receta receta;
    private double cuenta;
    private String alergias;
    private int estado;
    private Habitacion habitacion;

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    public Paciente(String nombre, String diagnostico, Medico medico, String alergias, Turno turno, double seguro,Receta receta, double cuenta) {
    
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.medico = medico;
        this.turno = turno;
        this.seguro=seguro;
        this.alergias=alergias;
        this.receta=receta;
        this.cuenta = cuenta;
    }
     @Override
    public String toString (){
        return "Nombre:"+nombre + "\n"+ "Diagnostico"+ diagnostico+"\n"+medico+"\n"+"Alergia:"+alergias+"\n"+"Turno"+turno+"\n"+"Habitacion:: "+habitacion+"\n"+seguro+"\n"+"valor a pagar:"+cuenta+"Receta:"+receta;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
   
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Turno getTurno() {
        return turno;    }

    public void setTurno(Turno turno) {        
        this.turno = turno;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

   public String getEstado(){
        String estado1="";
        switch(this.estado){
            case 0:
                estado1="Sano";
                break;
            case 1:
                estado1="Leve";
                break;
            case 2:
                estado1="Grave";
                break;
            case 3:
                estado1="Critico";
                break;
        }
        return estado1;
    }
    
    public void setEstado(int estado){
        this.estado=estado;
    }
       
    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    public Paciente(String Nombre, String diagnostico, Medico medico, Turno turno, int seguro, Receta receta, double cuenta) {
        super(Nombre);
       
        this.diagnostico = diagnostico;
        this.medico = medico;
        this.turno = turno;
        this.seguro = seguro;
        this.receta = receta;
        this.cuenta = cuenta;
    }
    public Paciente(){
        this.cuenta=this.turno.getPago()*(1-this.seguro);
    }
}
