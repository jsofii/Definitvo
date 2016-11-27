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
public class Direccion {
      private String principal;
    private String secundaria;
    private String numeracion;

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getSecundaria() {
        return secundaria;
    }

    public void setSecundaria(String secundaria) {
        this.secundaria = secundaria;
    
    }
    public void setDireccion(String principal,String secundaria,String numero){
        this.principal=principal;
        this.secundaria=secundaria;
        this.numeracion=numero;
    
}
    
}
