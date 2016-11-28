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
          java.util.Date fecha = new Date();
          java.util.Date Fecha = new Date();
          
           System.out.println(Fecha);
        
          
         int num_medicos=300;
         Medico[] m= new Medico[num_medicos];
         m[1]=new Medico("Pablo Almeida","cirujano general");
         m[2]=new Medico("Camila Moreira", "cirujana general");
         m[3]=new Medico("Andrea Jimenez", "médico general");
         m[4]=new Medico ("Camilo Guerrero", "medico general");
         m[5]=new Medico ("Bryan Utreras", " cirunan plastico");
         m[6]=new Medico ("Lorena Carrion","cirujana plastica");
         int n=0;
         System.out.println(m[2].getNombre() + m[2].getEspecialidad());
         
       
         Turno[] turno=new Turno[1000];
        
         
         
         
         
         
         
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
             int j=0;
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
                                Turno[] t= new Turno[n];
                                
                                switch (aux1){
                                    case 1:
                                        
                                        System.out.println("ingrese el nombre");
                                        String Nombre = aux.nextLine();
                                        
                                        System.out.println("ingrese el diagnostico");
                                        System.out.println(" Si el diganostico del paciente es :");
                                        System.out.println("Critico: 3");
                                        System.out.println("Grave: 2");
                                        System.out.println("leve:1");
                                        System.out.println("Sano:0");
                                        int  Diagnostico= aux.nextInt();
                                       
                                        switch ( Diagnostico){
                                            
                                            case 3:
                                                System.out.println("El estado del paciente es critico, es necesario asignarle una habitacion  en el piso 3 y un cirujano general");
                                                int Estado=3;
                                                System.out.println("El paciente debe se internado, el costo para que pueda ingresar es de 100 dólares");
                                                double Pag=100;
                                                
                                                
                                                
                                                turno[i]=new Turno(100, Fecha );
                                                p[i]=new Paciente (Nombre, Estado ,m[1], turno[i], Pag  );
                                                System.out.println("A continuacion le mostramos los datos del paciente");
                                                System.out.println("el nombre del paciente es");
                                                System.out.println(p[i].getNombre() );
                                                System.out.println("su diagnostico es "+p[i].getDiagnostico());
                                                System.out.println("el medico asignado es " + p[i].getMedico().getEspecialidad());
                                                System.out.println("la especialidad del medico es " +p[i].getMedico().getNombre()  );
                                             
                                                System.out.println("El costo y la fecha de ingreso es :");
                                                System.out.println(p[i].getTurno().toString());
                                                System.out.println("el paciente tiene un turno prioritario debido a su diagnostico");
                                                
                                                
                                                
                                                break;
                                                
                                            case 2:
                                                System.out.println("El estado el paciente es grave, es necesario asiganarle un cirujano");
                                                p[i].setMedico(m[2]);
                                                break;
                                            case 1:
                                                System.out.println("El estado del paciente es leve, es necesario asignarle un medico general");
                                                System.out.println("Si el paciente requiere una sutura presione '1' en caso contrario presion '2'");
                                                int Caso= aux.nextInt();
                                                
                                               switch (Caso){
                                                   case 1:
                                                       System.out.println(" Debido a que el paciente requiere una sutura, se le asignara un cirujano plastico y un turno para que sea atendido");
                                                       p[i].setMedico(m[5]);
                                                       p[i].setTurno(t[n]);
                                                   case 2:
                                                       System.out.println(" Debido a que el paciente no requiere, se le asignara un medico general");
                                                       p[i].setMedico(m[3]);
                                                       p[i].setTurno(t[n]);
                                                       
                                                       
                                                               
                                                       
                                                           
                                            
                                               }
                                        
                                
                                        }
                                       // p[1]=new Paciente(Nombre,Diagnostico);
                                       
                                       
                                        
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
            n++;
        }while(inicio !=3);
    }

        // TODO code application logic here
    }
    

