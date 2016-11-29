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
public class SistemasDefinitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Hospital h=new Hospital();
         Paciente[] p= new Paciente[100];
        
         
         
          
          java.util.Date Fecha = new Date();
          
           System.out.println(Fecha);
        
          
         int num_medicos=300;
         Medico[] m_critico= new Medico[30];
         Medico[] m_grave=new Medico[30];
         Medico[] m_grave2=new Medico[30];
         Medico [] m_leve= new Medico[100];
         m_critico[0]=new Medico("Carlos Paez","cirujano general", 1);
         m_critico[1]=new Medico("Camila Moreira", "cirujana general", 1);
         m_critico[2]=new Medico("Andrea Jimenez", "cirujano general", 1);
         m_critico[3]=new Medico ("Camilo Guerrero", "cirujano general", 1);
         m_critico[4]=new Medico ("Bryan Utreras", " cirujano general", 1);
         m_critico[5]=new Medico("Maria Lopez", "cirujana general", 1);
         
         m_grave[0]=new Medico ("Lorena Carrion","neurocirugía",1);
          m_grave[1]=new Medico ("Lorena Albuja","neurocirugía",1);
           m_grave[2]=new Medico ("Alvaro Rueda","neurocirugía",1);
            m_grave[3]=new Medico ("Camilo Echeverria","neurocirugía",1);
             m_grave[4]=new Medico ("Javier Aguirre","neurocirugía");
         
     
       
             
             
        m_grave2[0]=new Medico(" Patricia Alvarado", "cirujana general", 1);
        m_grave2[1]=new Medico(" Patricia Alvarado", "cirujana general", 1);
        m_grave2[2]=new Medico(" Patricia Alvarado", "cirujana general", 1);
        m_grave2[3]=new Medico(" Patricia Alvarado", "cirujana general", 1);
        m_grave2[4]=new Medico(" Patricia Alvarado", "cirujana general", 1);
        
        m_leve[0]=new Medico("Juan Ulloa", " medico general");
            m_leve[1]=new Medico("Juan Jimenez", " medico general");
                m_leve[2]=new Medico("Sebastian Jimenez", " medico general");
                    m_leve[3]=new Medico("Andrea Andrade", " medico general");
                        m_leve[4]=new Medico("Pepe Muerillo", " medico general");
                            m_leve[5]=new Medico("Felipe Andrade", " medico general");
                                m_leve[6]=new Medico("Santiago Risueño", " medico general");
                                    m_leve[7]=new Medico("Carina Bustamante", " medico general");
                                        m_leve[8]=new Medico("Juan Velasco", " medico general");
                                            m_leve[9]=new Medico("Tatiana Cordova", " medico general");
                                                m_leve[10]=new Medico("Clever Andrade", " medico general");
                                                    m_leve[11]=new Medico("Pedro Aguirre", " medico general");
                                                        m_leve[12]=new Medico("Carla Zambrano", " medico general");
                                                            m_leve[13]=new Medico("Natalia Vasconez", " medico general");
                                                                m_leve[14]=new Medico("Liliana Endara", " medico general");
                                                                

         int n=0;
         switch (m_critico[1].getEstado()){
        case 1:
        System.out.println("bien");
        break;
        case 2:
        System.out.println("mal");
        
    }
         int cont2=0;
         int cont1;
        
         while ( m_critico[cont2].getEstado()!=1){
             
         cont2++;    
             
         }
         
        
         
       
         Turno[] turno=new Turno[1000];
        
         
         
         
         
         
         
         int i=0;
         int j=0;
         
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
                                                while ( m_critico[cont2].getEstado()!=1){
             
                                                    cont2++;    
             
                                                     }
                                                m_critico[cont2].setEstado(0);
                                                
                                                
                                                
                                                
                                                turno[i]=new Turno(100, Fecha );
                                                int aux5=0;
                                               //si el medico esta ocupado el estado es "0" caso contrario "1"
                                                System.out.println("tiene el paciente seguro?");
                                                int x;
                                                System.out.println(" si tiene seguro presione '1' caso contrio presione'0");
                                                 x=sc.nextInt();
                                                 System.out.println(x);
                                                 float cuenta=0;
                                                 
                                                switch ( x){
                                                    case 1:
                                                        cuenta=10;
                                                        break;
                                                    case 0:
                                                        
                                                    cuenta= 100;
                                                    break;
                                                }
                                                System.out.println(cuenta);
                                               
                                                
                                                
                                              
                                                p[i]=new Paciente (Nombre, "Critico" ,m_critico [cont2], turno[i], 3, 1, cuenta );
                                                System.out.println("A continuacion le mostramos los datos del paciente");
                                                System.out.println("el nombre del paciente es");
                                                System.out.println(p[i].getNombre() );
                                                System.out.println("su diagnostico es "+p[i].getDiagnostico());
                                                System.out.println("el medico asignado es " + p[i].getMedico().getEspecialidad());
                                                System.out.println("la especialidad del medico es " +p[i].getMedico().getNombre()  );
                                                switch ( x){
                                                    case 1:
                                                        System.out.println("El paciente si tiene seguro");
                                                        break;
                                                    case 0:
                                                        
                                                        System.out.println("El paciente no tiene seguro");
                                                        break;
                                                }
                                             
                                                System.out.println("El costo y la fecha de ingreso es :");
                                                System.out.println(p[i].getTurno().toString());
                                                System.out.println("el paciente tiene un turno prioritario debido a su diagnostico");
                                                
                                                
                                                
                                                break;
                                                
                                            case 2:
                                                System.out.println("El estado el paciente es grave, es necesario asiganarle un cirujano");
                                            
                                                break;
                                            case 1:
                                                System.out.println("El estado del paciente es leve, es necesario asignarle un medico general");
                                                System.out.println("Si el paciente requiere una sutura presione '1' en caso contrario presion '2'");
                                                int Caso= aux.nextInt();
                                                
                                               switch (Caso){
                                                   case 1:
                                                       System.out.println(" Debido a que el paciente requiere una sutura, se le asignara un cirujano plastico y un turno para que sea atendido");
                                                      
                                                       p[i].setTurno(t[n]);
                                                   case 2:
                                                       System.out.println(" Debido a que el paciente no requiere, se le asignara un medico general");
                                                     
                                                       p[i].setTurno(t[n]);
                                                       
                                                       
                                                               
                                                       
                                                           
                                            
                                               }
                                        
                                               i++;
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
    

