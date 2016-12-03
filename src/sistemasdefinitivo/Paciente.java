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
    private Habitacion habitacion;
    private String diagnostico;
    private Medico medico;
    private Turno turno;
    private double seguro;
    private Receta receta;
    private double cuenta;
    private int estado;
    private String alergias;

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
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
        return turno;
    }

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

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
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
    
    public Paciente(int estado,Habitacion habitacion,Medico medico){
        super();
        this.habitacion=habitacion;
        this.estado=estado;
        this.medico=medico;
        this.receta=new Receta();
        this.seguro=0.8;
        this.turno=new Turno();
        this.diagnostico="";
        this.cuenta=this.turno.getPago()*(1-this.seguro);
    }
    
    public Paciente(Habitacion habitacion,Medico medico){
        super();
        this.habitacion=habitacion;
        this.estado=1;
        this.medico=medico;
        this.receta=new Receta();
        this.seguro=0.8;
        this.turno=new Turno();
        this.diagnostico="";
        this.cuenta=this.turno.getPago()*(1-this.seguro);
    }
    
    public Paciente(){
        super();
        this.habitacion=new Habitacion();
        this.estado=1;
        this.medico=new Medico();
        this.receta=new Receta();
        this.seguro=0.8;
        this.turno=new Turno();
        this.diagnostico="";
        this.cuenta=this.turno.getPago()*(1-this.seguro);
    }
    
    public void Cancelar(Paciente paciente){
        this.cuenta=0;
        System.out.println("Transacción realizada con exito");
        System.out.println("¡Muchas Gracias!");
    }
}
