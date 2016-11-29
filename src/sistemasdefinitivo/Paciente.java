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
     private String diagnostico;
     private Medico medico;
     private Turno turno;
     private int  seguro;
     private Receta receta;
     private  float cuenta;
     private  int piso;
     private String alergias;

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
     

   

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    

    @Override
    public String getNombre() {
        return nombre;
    }

    public Paciente(String nombre, String diagnostico, Medico medico, String alergias, Turno turno, int piso,  int seguro, float cuenta) {
    
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.medico = medico;
        this.turno = turno;
        this.seguro=seguro;
        this.piso=piso;
        this.alergias=alergias;
            
        this.cuenta = cuenta;
    }
    public String toString (){
        return "Nombre:"+nombre + "\n"+ "Diagnostico"+ diagnostico+"\n"+medico+"\n"+"Alergia:"+alergias+"\n"+"Turno"+turno+"\n"+"Piso:"+piso+"\n"+seguro+""+cuenta;
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
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

   

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public float getCuenta() {
        return cuenta;
    }

    public void setCuenta(float cuenta) {
        this.cuenta = cuenta;
    }

  

    public Paciente(String Nombre, String diagnostico, Medico medico, Turno turno,int piso, int seguro, Receta receta, float cuenta, String nombre) {
        super(Nombre);
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.medico = medico;
        this.turno = turno;
        this.seguro = seguro;
        this.receta = receta;
        this.cuenta = cuenta;
        this.piso=piso;
    }

    public Paciente(String nombre, String diagnostico, Medico medico, Turno turno, int seguro, Receta receta, float cuenta) {
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.medico = medico;
        this.turno = turno;
        this.seguro = seguro;
        this.receta = receta;
        this.cuenta = cuenta;
    }
    
    
    
    
}

