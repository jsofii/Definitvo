/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdefinitivo;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SistemasDefinitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Hospital h=new Hospital();
         Paciente[] p= new Paciente[100];
         p[1]=new Paciente ("sofi", "hosld");
         int i=0;
         
        Scanner sc=new Scanner(System.in);
        int inicio;
        do{
            System.out.println("Sistema Hospitalario del "+h.getNombre());
            System.out.println("Calificación: "+h.getCalificacion());
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Escoger otro hospital");
            System.out.println("3. Salir");
            System.out.println("Encuentrenos en: "+h.getDireccion().toString());
            inicio=sc.nextInt();
            sc.nextLine();
            switch(inicio){
                default:
                    System.out.println("Por favor, seleccione una opción válida");
                    break;
                case 1:
                    int usuario;
                    do{
                        Scanner aux=new Scanner(System.in);
                        System.out.println("¿Qué tipo de usuario es?");
                        System.out.println("1. Funcionario");
                        System.out.println("2. Medico");
                        System.out.println("3. Paciente");
                        System.out.println("4. Atras");
                        usuario=sc.nextInt();
                        sc.nextLine();
                        switch(usuario){
                            case 1:
                                System.out.println("Usted eligio funcionario");
                                System.out.print("Ingrese su usuario (C.I.): ");
                                String Cedula = aux.nextLine();
                                System.out.println("Ingrese lo que desea hacer");
                                System.out.println("Ingresar datos de paciente: 1");
                                System.out.println("Ingresar datos de un médico 2");
                                System.out.println("Buscar datos paciente: 3 ");
                                System.out.println("Buscar datos medico:4");
                                System.out.println("Buscar datos hospital:5");
                                int aux1;
                                aux1=sc.nextInt();
                                switch (aux1){
                                    case 1:
                                        
                                        System.out.println("ingrese el nombre");
                                        String Nombre = aux.nextLine();
                                        System.out.println("ingrese el diagnostico");
                                        String Diagnostico= aux.nextLine();
                                       // p[1]=new Paciente(Nombre,Diagnostico);
                                        System.out.println("lkdjfklasjfkljsdlkfdjlfjlsjlksdjlfk");
                                        p[i]=new Paciente(Nombre, Diagnostico);
                                        System.out.println(p[i].getNombre() +"djldkjdlkj"+ p[i].getDiagnostico());
                                       
                                        
                                        //System.out.println(p[1].getNombre());
                                        
                                    break;
                                    case 2: 
                                        System.out.println("ingrese el nombre del medico");
                                        String NombreMed = aux.nextLine();
                                        System.out.println("ingrese la especialidad");
                                        String Especialidad= aux.nextLine();
                                        break;
                                        
                                    case 3:
                                        System.out.println("que datos del paciente desea buscar");
                                        break;
                                    case 4:
                                        System.out.println("que datos del medico desea buscar");
                                        break;
                                    case 5:
                                        System.out.println("que datos del hospital  desea buscar");
                                        break;
                                        
                                }
                                
                                break;
                            case 2:
                                System.out.println("Usted eligio medico");
                                break;
                            case 3:
                                System.out.println("Usted eligio paciente");
                                break;
                        }
                    }while(usuario!=4);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del hospital: ");
                    String nombreh=sc.nextLine();
                    System.out.print("Ingrese la calificación del "+nombreh+": ");
                    String calificacion=sc.nextLine();
                    System.out.print("Ingrese la capacidad del "+nombreh+": ");
                    int capacidadh=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese la calle principal del "+nombreh+": ");
                    String principal=sc.nextLine();
                    System.out.print("Ingrese la calle secundaria del "+nombreh+": ");
                    String secundaria=sc.nextLine();
                    System.out.print("Ingrese el numero de calle del "+nombreh+": ");
                    String numero=sc.nextLine();
                    h.setHospital(nombreh, calificacion, capacidadh, principal, secundaria, numero);
                    System.out.println(h.getNombre()+" ingresado con exito");
                    break;
                case 3:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                
            }
            i++;
        }while(inicio !=3);
    }
        // TODO code application logic here
    }
    

