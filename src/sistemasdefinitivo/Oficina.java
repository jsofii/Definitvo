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
public class Oficina extends Cuarto{
    private int tipo;
    private String tipoOfi;
    private int estado;

    public String getTipoOfi() {
        return tipoOfi;
    }

    public void setTipoOfi(String tipoOfi) {
        this.tipoOfi = tipoOfi;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public String getTipo() {
        String tipo1="";
        switch(this.tipo){
            case 0:
                tipo1="Consultorio";
                break;
            case 1:
                tipo1="Laboratorio";
                break;
            case 2:
                tipo1="Quirófano";
                break;
        }
        return tipo1;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public Oficina(int numero,Piso piso){
        super(numero,piso);
        this.tipo=0;
        this.tipo=0;
    }
    
}
