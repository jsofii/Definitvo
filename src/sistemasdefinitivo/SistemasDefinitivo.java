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
        
        m_leve[0]=new Medico("Juan Ulloa", " medico general",1);
            m_leve[1]=new Medico("Juan Jimenez", " medico general",1);
                m_leve[2]=new Medico("Sebastian Jimenez", " medico general",1);
                    m_leve[3]=new Medico("Andrea Andrade", " medico general",1);
                        m_leve[4]=new Medico("Pepe Muerillo", " medico general",1);
                            m_leve[5]=new Medico("Felipe Andrade", " medico general",1);
                                m_leve[6]=new Medico("Santiago Risueño", " medico general",1);
                                    m_leve[7]=new Medico("Carina Bustamante", " medico general",1);
                                        m_leve[8]=new Medico("Juan Velasco", " medico general",1);
                                            m_leve[9]=new Medico("Tatiana Cordova", " medico general",1);
                                                m_leve[10]=new Medico("Clever Andrade", " medico general",1);
                                                    m_leve[11]=new Medico("Pedro Aguirre", " medico general",1);
                                                        m_leve[12]=new Medico("Carla Zambrano", " medico general",1);
                                                            m_leve[13]=new Medico("Natalia Vasconez", " medico general",1);
                                                                m_leve[14]=new Medico("Liliana Endara", " medico general",1);
                         Medico [] plas= new Medico [30];
                         plas[0]= new Medico( " Dayanara Ruiz", "Cirujana plastica",1);
                          plas[1]= new Medico( " Camila Escobar", "Cirujana plastica",1);
                           plas[2]= new Medico( "Sofía Almeida", "Cirujana plastica",1);
                            plas[3]= new Medico( " Camilo Ruiz", "Cirujana plastica",1);
                             plas[4]= new Medico( " Cinthya Benitez", "Cirujana plastica",1);
                              plas[5]= new Medico( " Rafael Salgado", "Cirujana plastica",1);
                               plas[6]= new Medico( " Christian Guerrero", "Cirujana plastica",1);
                                plas[7]= new Medico( " Mateo Murillo", "Cirujana plastica",1);
                                 plas[8]= new Medico( " Karen Viteri", "Cirujana plastica",1);
                                  plas[9]= new Medico( " Nicole Arrieta", "Cirujana plastica",1);
                                   plas[10]= new Medico( " Gabriela Andrade", "Cirujana plastica",1);
                                    plas[11]= new Medico( " Penelope Marin", "Cirujana plastica",1);
                                     plas[12]= new Medico( "Raul Iniesta ", "Cirujana plastica",1);
                                     
                        
                                                                

         
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
            int cont1;
            cont1=0;
            
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
                               // String Cedula = aux.nextLine();
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
                                       
                                        System.out.println("Critico: 3");
                                        System.out.println("Grave: 2");
                                        System.out.println("leve:1");
                                        System.out.println("Sano:0");
                                        int  Diagnostico= aux.nextInt();
                                       
                                        switch ( Diagnostico){
                                           
                                            
                                            case 3:
                                                
                                                    
                                                System.out.println("El estado del paciente es critico, es necesario asignarle una habitacion  en el piso 3 y un cirujano general");
                                             
                                                
                                                
                                                
                                                System.out.println(" Alergias del paciente");
                                                System.out.println("1.- Ibuprofeno");
                                                System.out.println("2.- Penicilina");
                                                System.out.println("3.- Anticonvulsivos");
                                                System.out.println("4.- Antivioticos");
                                                System.out.println("5.-Ninguno");
                                                int alergia;
                                                alergia=sc.nextInt();
                                                String al=" NINGUNA";
                                                switch( alergia){
                                                    case 1:
                                                        al="Ibuprofeno";
                                                        break;
                                                    case 2:
                                                        al="Penicilina";
                                                        break;
                                                    case 3:
                                                        al="Anticonvulsivo";
                                                        break;
                                                    case 4:
                                                        al="Antivioticos";
                                                        break;
                                                    case 5:
                                                        al="Ninguno";
                                                        break;
                                                        
                                                    
                                                }
                                                System.out.println(al);
                                                turno[i]=new Turno( 100, Fecha);
                                                 int contmed;
                                                contmed=0;
                                                while (m_critico[contmed].getEstado()!=1 ){
                                                    contmed++;
                                                    
                                                }
                                                m_critico[contmed].setEstado(0);
                                                System.out.println("Tiene el paciente seguro?");
                                                cont1=sc.nextInt();
                                                
                                                
                                                switch( cont1){
                                                    case 1:
                                                        System.out.println("El paciente esta asegurado");
                                                        break;
                                                    case 0:
                                                        System.out.println("El paciente no esta asegurado");
                                                        break;
                                                }
                                                
                                               
                                                p[i]=new Paciente (Nombre, "critico", m_critico[contmed],al, turno[i], 3, cont1, "No hay receta",100) ;
                                                System.out.println(p[i].toString());
                                                
                                               
                                              
                                              
                                             
                                             break;
                                                
                                            case 2:
                                              System.out.println("El estado del paciente es grave, es necesario asignarle una habitacion  en el piso 3 y un cirujano general");
                                             
                                                
                                                
                                                
                                                System.out.println(" Alergias del paciente");
                                                System.out.println("1.- Ibuprofeno");
                                                System.out.println("2.- Penicilina");
                                                System.out.println("3.- Anticonvulsivos");
                                                System.out.println("4.- Antivioticos");
                                                System.out.println("5.-Ninguno");
                                                int alergia1;
                                                alergia=sc.nextInt();
                                                String al1=" NINGUNA";
                                                switch( alergia){
                                                    case 1:
                                                        al1="Ibuprofeno";
                                                        break;
                                                    case 2:
                                                        al1="Penicilina";
                                                        break;
                                                    case 3:
                                                        al1="Anticonvulsivo";
                                                        break;
                                                    case 4:
                                                        al1="Antivioticos";
                                                        break;
                                                    case 5:
                                                        al1="Ninguno";
                                                        break;
                                                        
                                                    
                                                }
                                                System.out.println(al1);
                                                turno[i]=new Turno( 100, Fecha);
                                                 int contmed1;
                                                contmed=0;
                                                System.out.println("Elija un opcion");
                                                System.out.println("1.- Paciente con traumatismo craneal");
                                                System.out.println("2.- Paciente sin traumantismo creaneal");
                                                int tip=0;
                                                tip=sc.nextInt();
                                                int contip=0;
                                                switch (tip){
                                                    case 1:
                                                        
                                                        
                                                    while (m_grave[contip].getEstado()!=1 ){
                                                        
                                                        
                                                    contip++;
                                                    
                                                    }
                                                    m_grave[contip].setEstado(0);
                                                    p[i]=new Paciente (Nombre, "critico", m_grave[contip],al1, turno[i], 3, cont1,"no hay receta",100) ;
                                                    break;
                                                    case 2:
                                                        while (m_grave2[contip].getEstado()!=0){
                                                            contip++;
                                                            
                                                        }
                                                        
                                                            m_grave2[contip].setEstado(0);
                                                            p[i]=new Paciente (Nombre, "critico", m_grave2[contip],al1, turno[i], 3, cont1,"no hay receta",100) ;
                                                        break; 
                                                }  
                                                
                                                System.out.println("Tiene el paciente seguro?");
                                                cont1=sc.nextInt();
                                                
                                                
                                                switch( cont1){
                                                    case 1:
                                                        System.out.println("El paciente esta asegurado");
                                                        break;
                                                    case 0:
                                                        System.out.println("El paciente no esta asegurado");
                                                        break;
                                                }
                                                
                                               
                                              
                                                System.out.println(p[i].toString());
                                                
                                               
                                              
                                              
                                             
                                             
                                                        break;
                                                   
                                                
                                            
                                               
                                            case 1:
                                                int contador;
                                                contador=0;
                                                System.out.println("El estado del paciente es leve, es necesario asignarle un medico general");
                                                System.out.println("ingrese fecha para el turno");
                                                System.out.println("Día");
                                                int dia;
                                                dia=0;
                                                dia=sc.nextInt();
                                                System.out.println("mes");
                                                int mes=0;
                                                mes=sc.nextInt();
                                                System.out.println("año");
                                                int año=0;
                                                año=sc.nextInt();
                                                turno[i]=new Turno(dia, mes, año);
                                                System.out.println("Tiene el paciente seguro?");
                                                cont1=sc.nextInt();
                                                
                                              
                                                        
                                                        float valorcons=0;
                                                switch( cont1){
                                                    case 1:
                                                        System.out.println("El paciente esta asegurado");
                                                        valorcons=50;
                                                        
                                                        break;
                                                    case 0:
                                                        System.out.println("El paciente no esta asegurado");
                                                        valorcons=75;
                                                        break;
                                                }
                                                System.out.println("Si el paciente requiere una sutura presione '1' en caso contrario presion '2'");
                                                int Caso= sc.nextInt();
                                                
                                                int cont11=0;
                                               switch (Caso){
                                               
                                                   case 1:
                                                       System.out.println(" Debido a que el paciente requiere una sutura, se le asignara un cirujano plastico y un turno para que sea atendido");
                                                      while( plas[3].getEstado()!=1){
                                                       
                                                      }
                                                      plas[3].setEstado(0);
                                                      p[i]=new Paciente(Nombre,  "leve", plas[contador], turno[i], 1,cont1, "paracetal", valorcons ) ;
                                                      break;
                                                   case 2:
                                                       System.out.println(" Debido a que el paciente no requiere, se le asignara un medico general");
                                                     while ( m_leve[contador].getEstado()!=1){
                                                       contador++;
                                                   }
                                                     
                                                     m_leve[contador].setEstado(0);
                                                      p[i]=new Paciente(Nombre,  "leve", m_leve[contador], turno[i], 1,cont1, "paracetal", valorcons ) ;
                                                     break;
                                                     
                                               }
                                                System.out.println("Datos paciente"+p[i].toString());
                                               
                                               
                                                       
                                                       
                                                               
                                                       
                                                           
                                            
                                               
                                        
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
           
        }while(inicio !=3);
    }

        // TODO code application logic here
    }
    
