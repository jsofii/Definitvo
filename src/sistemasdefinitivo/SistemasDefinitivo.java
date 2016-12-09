/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdefinitivo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SistemasDefinitivo {

    public static int menuIngreso(Hospital h) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDOS AL SISTEMA HOSPITALARIO: " + h.getNombre());
        System.out.println("Calificación: " + h.getCalificacion());
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Iniciar Sesión");
        System.out.println("2. Escoger otro hospital");
        System.out.println("3. Salir");
        System.out.println("Encuentrenos en: " + h.getDireccion().toString());
        int menu = manejoErrorLetra();
        return menu;

    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué tipo de usuario es?");
        System.out.println("1. Funcionario");
        System.out.println("2. Medico");
        System.out.println("3. Paciente");
        System.out.println("4. Atras");
        int usuario = manejoErrorLetra();
        return usuario;
    }

    public static int menuOpciones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario ingresado con exito");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Registrar medico");
        System.out.println("2. Registrar paciente");
        System.out.println("3. Consultar lista de pacientes");
        System.out.println("4. Consultar lista de medicos");
        System.out.println("5. Salir");
        int menu = manejoErrorLetra();
        return menu;

    }

    public static void listamedicos(Medico m[]) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(i + ".-" + m[i].toString());
            System.out.println("\n");
        }
    }

    public static void listapacientes(Paciente p[]) {
        for (int i = 0; i < p.length; i++) {
            System.out.println(i + ".-" + p[i].toString());
            System.out.println("\n");
        }
    }

    public static void listaestados() {
        System.out.println("1. Sano");
        System.out.println("2. Leve");
        System.out.println("3. Grave");
        System.out.println("4. Crítico");

    }

    public static boolean verificarPaciente(String cedula, Paciente p[]) {
        boolean aux;
        aux = false;
        for (int i = 0; i <= p.length; i++) {
            if (p[i].getCedula().equals(cedula)) {
                aux = true;
            }
        }
        return aux;
    }

    public static int buscarnumeropaciente(Paciente p[], String cedula) {
        int n = 0;
        for (int i = 0; i <= p.length; i++) {
            if (p[i].getCedula().equals(cedula)) {
                n = i;
            }
        }
        return n;
    }

    public static void listapaciente(Paciente pa[], int aux) {
       for (int i = 0; i < aux; i++) {

            System.out.println(i+".-\t" + "\tNombre:" + pa[i].getNombre());
            System.out.println("\t\tCedula:" + pa[i].getCedula());
            System.out.println("\t\tDiagnostico:" + pa[i].getDiagnostico());
            System.out.println("\t\tReceta");
            System.out.println("\t\t\tMedicamento:" + pa[i].getReceta().getMedicamento());
            System.out.println("\t\t\tConcentracion:" + pa[i].getReceta().getConcentracion());
            System.out.println("\t\tHabitacion:");
            System.out.println("\t\t\tNúmero:" + pa[i].getMedico().getOficina().getNumero());
            System.out.println("\t\t\tPiso" + pa[i].getHabitacion().getPiso().getNumero());
            System.out.println("\t\tMédico asignado:");
            System.out.println("\t\t\tNombre:" + pa[i].getMedico().getNombre());
            System.out.println("\t\t\t Especialidad:" + pa[i].getMedico().getEspecialidad());

            System.out.println("Consultorio:" + pa[i].getMedico().getOficina().getNumero());

        }
    }

    public static void listamedicos(Medico m[], int auxm) {
        for (int i = 0; i < auxm; i++) {
            System.out.println(i+".-\t"+"\tNombre:"+ m[i].getNombre());
            System.out.println("\t\tCédula:"+m[i].getCedula());
            System.out.println("\t\t Especialidad:"+m[i].getEspecialidad());
            System.out.println("\t\t Oficina:"+m[i].getOficina().getNumero());
            
        }
    }

    public static int manejoErrorLetra() {
        Scanner sc = new Scanner(System.in);
        int a = -1;
        try {
            a = sc.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese una opcion valida");
        }
        return a;
    }

    public static String validacionCedula() {
        Scanner sc = new Scanner(System.in);
        int y = 0;
        do {
            String ci = sc.nextLine();
            int x = 0;
            try {
                x = Integer.parseInt(ci);
            } catch (java.lang.NumberFormatException e) {
                System.out.print("Ingrese una cédula válida: ");
            }
            y = x;
        } while (y == 0);
        String ci = "" + y;
        return ci;
    }

    public static int manejoErrorArray() {
        Scanner sc = new Scanner(System.in);
        int a = -1;
        try {
            a = sc.nextInt();
        } catch (java.util.InputMismatchException | java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Por favor, ingrese una opcion valida");
        }
        return a;
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int aux = 0;
        int auxm = 0;
        Hospital h = new Hospital();
        Scanner sc = new Scanner(System.in);
        int inicio;
        do {
            inicio = menuIngreso(h);
            switch (inicio) {
                default:
                    System.out.println("Por favor, ingrese una opción válida");
                    break;
                case 1:
                    int usuario;
                    Piso[] p;
                    p = new Piso[h.getCapacidad() / 15];
                    for (int i = 0; i < (h.getCapacidad() / 15); i++) {
                        p[i] = new Piso(i, h);
                    }
                    Habitacion[] hab;
                    hab = new Habitacion[h.getCapacidad() / 3];
                    Oficina[] o;
                    o = new Oficina[h.getCapacidad() / 3];
                    for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                        hab[i] = new Habitacion(i, p[i / 5]);
                        o[i] = new Oficina(i, p[i / 5]);
                    }
                    hab[0].setCapacidad(h.getCapacidad() / 3);
                    int k = o.length;
                    for (int i = 0; i < k; i++) {
                        o[i / 2].setTipo(2);
                        o[i / 4].setTipo(1);
                    }
                    Medico[] m;
                    m = new Medico[h.getCapacidad() / 3];
                    int j = 0;
                    for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                        m[i] = new Medico(o[i]);
                        j++;
                    }
                    Paciente[] pa;
                    pa = new Paciente[2 * j];
                    for (int ñ = 0; ñ < (2 * j); ñ++) {
                        pa[ñ] = new Paciente(hab[j / 2], m[j / 2]);
                    }
                    do {
                        usuario = menu();
                        int nu = 0;
                        switch (usuario) {
                            default:
                                System.out.println("Por favor, ingrese una opción válida");
                                break;
                            case 1:
                                System.out.println("Usted eligio funcionario");
                                System.out.print("Ingrese su usuario (C.I.): ");
                                String ci = validacionCedula();
                                if (ci.length() == 10) {
                                    Funcionario f = new Funcionario(ci);
                                    int fun;
                                    do {
                                        fun = menuOpciones();
                                        switch (fun) {
                                            default:
                                                System.out.println("Por favor, ingrese una opción válida");
                                                break;
                                            case 1:
                                                System.out.print("Ingrese el nombre del medico: ");
                                                String nombrem = sc.nextLine();
                                                String auxnom1 = nombrem.toUpperCase();
                                                System.out.println("ingrese la cedula del medico");
                                                String cedulaMedico = validacionCedula();
                                                nombrem = auxnom1;
                                                System.out.println("¿Cuál es la especialidad del médico " + nombrem + "?");
                                                System.out.println("1. General");
                                                System.out.println("2. Medico Quirurgico");
                                                System.out.println("3. Cirugia");
                                                System.out.println("4. Laboratorio");
                                                int esp = -1;
                                                do {
                                                    esp = manejoErrorLetra();
                                                } while (esp == -1 | esp > 4);
                                                System.out.println("Por favor, asigne una oficina al medico " + nombrem);
                                                switch (esp) {
                                                    default:
                                                        System.out.println("Por favor, ingrese una opción válida");
                                                        break;
                                                    case 1:
                                                        for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                                                            if (o[i].getTipo().equals("Consultorio") && o[i].getEstado() == 0) {
                                                                System.out.println(i + ". " + o[i].getNumero());
                                                            }
                                                        }
                                                    case 2:
                                                        for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                                                            if (o[i].getTipo().equals("Quirófano") && o[i].getEstado() == 0) {
                                                                System.out.println(i + ". " + o[i].getNumero());
                                                            }
                                                        }
                                                    case 3:
                                                        for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                                                            if (o[i].getTipo().equals("Quirofano") && o[i].getEstado() == 0) {
                                                                System.out.println(i + ". " + o[i].getNumero());
                                                            }
                                                        }
                                                    case 4:
                                                        for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                                                            if (o[i].getTipo().equals("Laboratorio") && o[i].getEstado() == 0) {
                                                                System.out.println(i + ". " + o[i].getNumero());
                                                            }
                                                        }
                                                }
                                                int ofi = -1;
                                                do {
                                                    ofi = manejoErrorArray();
                                                } while (ofi == -1);
                                                m[auxm] = f.registrarMedico(o[ofi], nombrem, esp, cedulaMedico);
                                                auxm++;
                                                break;
                                            case 2:
                                                System.out.print("Ingrese el nombre del paciente: ");
                                                String nombre = sc.nextLine();
                                                String auxnom2 = nombre.toUpperCase();
                                                nombre = auxnom2;
                                                System.out.println("ingrese la cedula del paciente");
                                                String cedulaPaciente = validacionCedula();
                                                System.out.println("Ingrese el estado del paciente " + nombre);
                                                System.out.println("1. Leve");
                                                System.out.println("2. Grave");
                                                System.out.println("3. Critico");
                                                int estado = -1;
                                                do {
                                                    estado = manejoErrorLetra();
                                                } while (estado == -1 | estado > 3);
                                                switch (estado) {
                                                    default:
                                                        System.out.println("Por favor, ingrese una opción válida");
                                                        break;
                                                    case 1:
                                                        System.out.println("El estado del paciente es leve, se le asignara un medico general");
                                                        System.out.println("Por favor, escoja un medico de la lista");
                                                        for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                                                            if ((m[i].getEspecialidad().equalsIgnoreCase("General")) && (m[i].getEstado() == 0)) {
                                                                System.out.println(i + ". " + m[i].getNombre());
                                                            }
                                                        }
                                                        System.out.println("El paciente puede seguir a la sala de espera");
                                                        break;
                                                    case 2:
                                                        System.out.println("El estado del paciente es grave, es necesario asignarle una habitacion y un medico cirujano");
                                                        System.out.println("Por favor, escoja un médico de la lista");
                                                        for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                                                            if ((m[i].getEspecialidad().equalsIgnoreCase("Medico Quirurgico")) && (m[i].getEstado() == 0)) {
                                                                System.out.println(i + ". " + m[i].getNombre());
                                                            }
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.println("El estado del paciente es crítico, es necesario asignarle una habitacion y un cirujano");
                                                        System.out.println("Por favor, escoja un medico de la lista:");
                                                        for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                                                            if ((m[i].getEspecialidad().equalsIgnoreCase("Cirugia")) && (m[i].getEstado() == 0)) {
                                                                System.out.println(i + ". " + m[i].getNombre());
                                                            }
                                                        }
                                                }
                                                int med = -1;
                                                do {
                                                    med = manejoErrorArray();
                                                } while (med == -1);
                                                int habi = -1;
                                                if (estado == 1) {
                                                    habi = 0;
                                                } else {
                                                    System.out.println("Seleccione en que habitación alojará al paciente:");
                                                    for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                                                        if (hab[i].getEstado() < 2) {
                                                            System.out.println(i + ". " + hab[i].getNumero());
                                                        }
                                                    }
                                                    do {
                                                        habi = manejoErrorArray();
                                                    } while (habi == -1);
                                                    System.out.println("" + hab[0].getEstado());
                                                }
                                                pa[aux] = f.registrarPaciente(nombre, estado, m[med], hab[habi], cedulaPaciente);
                                                aux++;
                                                break;
                                            case 3:
                                                System.out.println("Los pacientes registrados son ");
                                                listapaciente(pa, aux);
                                                break;
                                            case 4:
                                                System.out.println("Los médicos registrados son :");
                                                listamedicos(m, auxm);
                                                break;
                                        }
                                    } while (fun != 5);
                                } else {
                                    System.out.println("Acceso Negado");
                                }
                                break;
                            case 2:
                                System.out.println("Usted eligio medico");
                                System.out.println("Ingrese su cedula:");
                                String auxce = validacionCedula();
                                for (int i = 0; i < (h.getCapacidad() / 3); i++) {
                                    boolean ingreso = false;
                                    if (auxce.equals(m[i].getCedula())) {
                                        ingreso = true;
                                        System.out.println("¡Inicio de sesion exitoso!");
                                        int aux6;
                                        do {
                                            System.out.println("¿Qué desea hacer?");
                                            System.out.println("1. Consultar lista de pacientes");
                                            System.out.println("2. Atender paciente");
                                            System.out.println("3. Salir");
                                            aux6 = manejoErrorLetra();
                                            switch (aux6) {
                                                default:
                                                    System.out.println("Por favor, ingrese una opción válida");
                                                    break;
                                                case 1:
                                                    listapaciente(pa, aux);
                                                    break;
                                                case 2:
                                                    System.out.println("Cual de los siguientes pacientes debe atender");
                                                    System.out.println("Para escogerlo escriba su posicion en la lista considerando la numeracion desde 0");
                                                    listapaciente(pa, aux);
                                                    int numpa = -1;
                                                    do {
                                                        numpa = manejoErrorArray();
                                                    } while (numpa == -1 | numpa > pa.length);
                                                    System.out.println("Que es lo que desea hacer?");
                                                    System.out.println("1. Ingresar la receta");
                                                    System.out.println("2. Cambiar estado del paciente");
                                                    System.out.println("3. Ingresar la receta y cambiar el estado del paciente");
                                                    int aux7 = -1;
                                                    do {
                                                        aux7 = manejoErrorLetra();
                                                    } while (aux7 == -1 | aux7 > 3);
                                                    switch (aux7) {
                                                        default:
                                                            System.out.println("Por favor, ingrese una opción válida");
                                                            break;
                                                        case 1:
                                                            System.out.println("Ingrese el medicamento");
                                                            String aaaa = sc.nextLine();
                                                            System.out.println("Ingrese la concentracion en mg del medicamento");
                                                            int concentracion = -1;
                                                            do {
                                                                concentracion = manejoErrorLetra();
                                                            } while (concentracion == -1);
                                                            pa[numpa].getReceta().setConcentracion(concentracion);
                                                            pa[numpa].getReceta().setMedicamento(aaaa);
                                                            System.out.println("Receta ingresada con exito!");
                                                            break;
                                                        case 2:
                                                            System.out.println("Elija una opcion");
                                                            listaestados();
                                                            int cont6 = manejoErrorLetra();
                                                            switch (cont6) {
                                                                case 1:
                                                                    pa[numpa].setEstado(0);
                                                                    break;
                                                                case 2:
                                                                    pa[numpa].setEstado(1);
                                                                    break;
                                                                case 3:
                                                                    pa[numpa].setEstado(2);
                                                                    break;
                                                                case 4:
                                                                    pa[numpa].setEstado(3);
                                                                    break;
                                                            }
                                                            break;
                                                        case 3:
                                                            System.out.println("Ingrese el medicamento recetado");
                                                            String medicamentore = sc.nextLine();
                                                            System.out.println("Ingrese la concentracion en mg del medicamento");
                                                            int concentracion1 = -1;
                                                            do {
                                                                concentracion1 = manejoErrorLetra();
                                                            } while (concentracion1 == -1);
                                                            pa[numpa].getReceta().setMedicamento(medicamentore);
                                                            pa[numpa].getReceta().setConcentracion(concentracion1);
                                                            System.out.println("Elija una opcion");
                                                            listaestados();
                                                            int cont10 = manejoErrorLetra();
                                                            switch (cont10) {
                                                                case 1:
                                                                    pa[numpa].setEstado(1);
                                                                    break;
                                                                case 2:
                                                                    pa[numpa].setEstado(2);
                                                                    break;
                                                                case 3:
                                                                    pa[numpa].setEstado(3);
                                                                    break;
                                                                case 4:
                                                                    pa[numpa].setEstado(4);
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } while (aux6 != 3);
                                    } else {
                                        nu = 0;
                                    }
                                }
                                if (nu == 0) {
                                    System.out.println("usuario no registrado");
                                }
                                break;
                            case 3:
                                System.out.println("Usted eligio paciente");
                                System.out.println("Ingrese su cedula");
                                String cedula2 = validacionCedula();
                                int ingreso = 0;
                                for (int i = 0; i < (h.getCapacidad() / 3); i++) {

                                    if (cedula2.equals(pa[i].getCedula())) {
                                        ingreso = 1;
                                    }
                                }
                                if (ingreso == 1) {
                                    System.out.println("sus datos son:");
                                    listapaciente(pa, aux);
                                } else {
                                    System.out.println("usuario no registrado");
                                }
                                break;
                        }
                    } while (usuario != 4);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del hospital: ");
                    String nombreh = sc.nextLine();
                    System.out.print("Ingrese la calificación del " + nombreh + ": ");
                    String calificacion = sc.nextLine();
                    System.out.print("Ingrese la capacidad del " + nombreh + ": ");
                    int capacidadh = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese la calle principal del " + nombreh + ": ");
                    String principal = sc.nextLine();
                    System.out.print("Ingrese la calle secundaria del " + nombreh + ": ");
                    String secundaria = sc.nextLine();
                    System.out.print("Ingrese el numero de calle del " + nombreh + ": ");
                    String numero = sc.nextLine();
                    h.setHospital(nombreh, calificacion, capacidadh, principal, secundaria, numero);
                    System.out.println(h.getNombre() + " ingresado con exito");
                    break;
                case 3:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
            }
        } while (inicio != 3);
    }
}
