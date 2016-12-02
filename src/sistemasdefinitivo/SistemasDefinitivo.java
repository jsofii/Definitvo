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
                    Piso[] p;
                    p = new Piso[h.getCapacidad()/15];
                    for(int i=0;i<(h.getCapacidad()/15);i++){
                        p[i]=new Piso(i,h);
                    }
                    Habitacion[] hab;
                    hab= new Habitacion[h.getCapacidad()/3];
                    Oficina[] o;
                    o= new Oficina[h.getCapacidad()/3];
                    for(int i=0;i<(h.getCapacidad()/3);i++){
                        hab[i]=new Habitacion(i,p[i/5]);
                        o[i]=new Oficina(i,p[i/5]);
                    }
                    Medico[] m;
                    m= new Medico[h.getCapacidad()/3];
                    int j=0;
                    for(int i=0;i<(h.getCapacidad()/3);i++){
                        m[i]=new Medico(o[i/3]);
                        j++;
                    }
                    Paciente[] pa;
                    pa=new Paciente[2*j];
                    do{
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
                                String ci=sc.nextLine();
                                Funcionario f=new Funcionario(ci);
                                int fun;
                                do{
                                    System.out.println("Usuario ingresado con exito");
                                    System.out.println("¿Qué desea hacer?");
                                    System.out.println("1. Registrar medico");
                                    System.out.println("2. Registrar paciente");
                                    System.out.println("3. Consultar lista de pacientes");
                                    System.out.println("4. Consultar lista de medicos");
                                    System.out.println("5. Asignar cita a un paciente");
                                    System.out.println("6. Salir");
                                    fun=sc.nextInt();
                                    sc.nextLine();
                                    int aux=0;
                                    int med=0;
                                    switch(fun){
                                        case 1:
                                            
                                        case 2:    
                                            System.out.println("Ingrese el nombre del paciente:");
                                            String nombre=sc.nextLine();
                                            System.out.println("Ingrese el estado del paciente "+nombre);
                                            System.out.println("1. Leve");
                                            System.out.println("2. Grave");
                                            System.out.println("3. Critivo");
                                            int estado=sc.nextInt();
                                            sc.nextLine();
                                            switch(estado){
                                                case 1:
                                                System.out.println("El estado del paciente es leve, se le asignara un medico general");
                                                System.out.println("Por favor, escoja un medico de la lista");
                                                for(int i=0;i<(h.getCapacidad()/3);i++){
                                                    if((m[i].getEspecialidad().equalsIgnoreCase("General"))&&(m[i].getEstado()==0)){
                                                        System.out.println(i+". "+m[i].getNombre());
                                                    }
                                                }
                                                med=sc.nextInt();
                                                sc.nextLine();
                                            }
                                            System.out.println("Seleccione en que habitación alojará al paciente:");
                                            for (int i=0;i<(h.getCapacidad()/3);i++){
                                                if(hab[i].getEstado()<2){
                                                    System.out.println(i+". "+hab[i].getNumero());
                                                }
                                            }
                                            
                                            pa[aux]=f.registrarPaciente(nombre, estado, m[med], hab[0]);
                                            aux++;
                                            break;
                                    }
                                }while(fun!=6);
                                
                                break;
                            case 2:
                                System.out.println("Usted eligio medico");
                                System.out.println("Por favor, ingrese su nombre distinguiendo entre mayusculas y minusculas ");
                                String userm=sc.nextLine();
                                for(int i=0;i<(h.getCapacidad()/3);i++){
                                    if(userm.equals(m[i].getNombre())){
                                        System.out.println("¡Inicio de sesion exitoso!");
                                        System.out.println("¿Qué desea hacer?");
                                        System.out.println("1. Consultar lista de pacientes");
                                        System.out.println("2. Atender paciente");
                                    }
                                }
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
        }while(inicio !=3);
    }    
}
