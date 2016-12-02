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
public class Funcionario {
    private String ci;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public Funcionario(String ci){
        this.ci=ci;
    }
    
    public Paciente registrarPaciente(String nombre,int estado,Medico medico,Habitacion habitacion){
        Paciente paciente=new Paciente();
        paciente.setNombre(nombre);
        paciente.setEstado(estado);
        Scanner sc=new Scanner(System.in);
        switch(estado){
            case 3:
                System.out.println("El estado del paciente es crítico, es necesario asignarle una habitacion  en Emergencias y un cirujano general");
                java.util.Date fecha = new Date();
                Turno turno=new Turno(1000, fecha);
                paciente.setTurno(turno);                               
                break;      
            case 2:
                System.out.println("El estado del paciente es grave, es necesario asignarle una habitacion  en Emergencias y un cirujano general");
                java.util.Date fecha1 = new Date();
                Turno turno1=new Turno(100, fecha1);
                paciente.setTurno(turno1);
                System.out.println("Elija un opcion");
                System.out.println("1. Paciente con traumatismo craneal");
                System.out.println("2. Paciente sin traumantismo creaneal");
                break;
            case 1:
                System.out.println("Ingrese la fecha para el turno");
                System.out.print("Día ");
                int dia=sc.nextInt();
                System.out.print("Mes ");
                int mes=sc.nextInt();
                System.out.print("año");
                int año=sc.nextInt();
                Turno turno2=new Turno(dia, mes, año);
                paciente.setTurno(turno2);
                break;
        }
        paciente.setMedico(medico);
        medico.setEstado(1);
        paciente.setHabitacion(habitacion);
        System.out.println("¿El paciente "+nombre+" tiene alergias a algún medicamento?");
        System.out.println("1. Ibuprofeno");
        System.out.println("2. Penicilina");
        System.out.println("3. Anticonvulsivos");
        System.out.println("4. Antibióticos");
        System.out.println("5. Ninguno");
        int alergia1=sc.nextInt();
        sc.nextLine();
        String al="";
        switch(alergia1){
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
                al="Antibióticos";
                break;
            case 5:
                al="Ninguno";
                break;                                 
        }
        paciente.setAlergias(al);
        System.out.println("Tiene el paciente seguro?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int cont1=sc.nextInt();
        sc.nextLine();
        switch(cont1){
            case 1:
                System.out.println("¿Cuál es la cobertura del seguro?");
                System.out.println("Ingreselo como termino porcentual en un rango de 0 a 100");
                int cob=sc.nextInt();
                sc.nextLine();
                paciente.setSeguro(cob);
                break;
            case 2:
                paciente.setSeguro(cont1);
                break;
        }
        return paciente;
    }
}
