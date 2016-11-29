/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdefinitivo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Turno {
    private double pago;
    private int dia;
    private int mes;
    private int año;
    private Date fecha;
    Scanner sc=new Scanner(System.in);

    public Turno(double pago, Date fecha) {
        this.pago = pago;
        this.fecha = fecha;
    }
    
    

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        String mes1="";
        switch(this.mes){
            case 1:
                mes1="Enero";
                break;
            case 2:
                mes1="Febrero";
                break;
            case 3:
                mes1="Marzo";
                break;
            case 4:
                mes1="Abril";
                break;
            case 5:
                mes1="Mayo";
                break;
            case 6:
                mes1="Junio";
                break;
            case 7:
                mes1="Julio";
                break;
            case 8:
                mes1="Agosto";
                break;
            case 9:
                mes1="Septiembre";
                break;
            case 10:
                mes1="Octubre";
                break;
            case 11:
                mes1="Noviembre";
                break;
            case 12:
                mes1="Diciembre";
                break;
        }
        return mes1;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public Turno(){
        this.pago=40;
        this.dia=1;
        this.mes=1;
        this.año=2017;
    }
    
    public String toString(){
        return "la fecha asignada para el turno es"+fecha;
    }
    
}
