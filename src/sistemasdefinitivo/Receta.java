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
public class Receta {
    private String medicamento;
    private int concentracion;

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(int concentracion) {
        this.concentracion = concentracion;
    }
    
    public Receta(){
        this.medicamento="Paracetamol";
        this.concentracion=500;
    }

    public Receta(String Medicamento, int Concentracion) {
        this.medicamento = Medicamento;
        this.concentracion = Concentracion;
    }
    
  
}
