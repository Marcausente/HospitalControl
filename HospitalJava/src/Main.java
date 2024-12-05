import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Paciente> listaEspera = new ArrayList<>(); // Lista de espera para pacientes

    public static void main(String[] args) {

        int menu = 0;
        printmenu(menu);
    }

    private static void printmenu(int menu) {
        do {
            System.out.println("===============");
            System.out.println("  MY HOSPITAL  ");
            System.out.println("===============");
            System.out.println("1. Añadir paciente a la lista de espera");
            System.out.println("2. Ver lista de espera");
            System.out.println("3. Enviar paciente a quirofano");
            System.out.println("4. Muestra la relación de pacientes ya operados");
            System.out.println("5. Salir");

            try {
                menu = input.nextInt();
                input.nextLine(); //Esto limpia el buffer que si no se queda vacio
                switch (menu) {
                    case 1:
                        System.out.println("Has seleccionado 'Añadir paciente a la lista de espera'");
                        agregarPaciente();
                        break;
                    case 2:
                        System.out.println("Has seleccionado 'Ver la lista de espera'");
                        mostrarListaEspera();
                        break;
                    case 3:
                        System.out.println("Has seleccionado 'Enviar paciente al quirofano'");
                        enviarPacienteQuirofano();
                        break;
                    case 4:
                        System.out.println("Has seleccionado 'Muestra la relación de pacientes ya operados'");
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("ERROR, selecciona un numero valido");
                        break;
                }
            } catch (Exception e) {
                System.out.println("ERROR: Por favor ingresa un dato valido");
                input.nextLine();
            }
        } while (menu != 5);
    }

    private static void enviarPacienteQuirofano() {
        if (listaEspera.isEmpty()) {
            System.out.println("No hay pacientes en la lista de espera.");
            return;
        }

        Paciente paciente = listaEspera.remove(0);
        System.out.println("El paciente " + paciente.getNombre() + " " + paciente.getApellido() + " ha sido enviado al quirófano.");
    }


    private static void mostrarListaEspera() {
            if (listaEspera.isEmpty()) {
                System.out.println("La lista de espera está vacía.");
            } else {
                System.out.println("Lista de espera:");
                for (int i = 0; i < listaEspera.size(); i++) {
                    System.out.println((i + 1) + ". " + listaEspera.get(i));
                }
            }
    }

    private static void agregarPaciente() {
        String nombre, apellido, motivoOperacion, gravedad;
        int menu = 0;

        try {
            System.out.print("Introduce el nombre del paciente: ");
            nombre = input.nextLine();
            if (nombre.isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío.");
            }

            System.out.print("Introduce el apellido del paciente: ");
            apellido = input.nextLine();
            if (apellido.isEmpty()) {
                throw new IllegalArgumentException("El apellido no puede estar vacío.");
            }

            System.out.print("Introduce el motivo de la operación: ");
            motivoOperacion = input.nextLine();

            if (motivoOperacion.isEmpty()) {
                throw new IllegalArgumentException("El motivo de la operación no puede estar vacío.");
            }
            gravedad = niveldegravedad(menu);1

            Paciente nuevoPaciente = new Paciente(nombre, apellido, motivoOperacion, gravedad);
            listaEspera.add(nuevoPaciente);
            System.out.println("Paciente añadido a la lista de espera.");

        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Por favor, inténtalo de nuevo.");
        } catch (Exception e) {
            System.out.println("ERROR inesperado: " + e.getMessage());
        }
    }

    private static int niveldegravedad(int menu) {
        int gravedad = 0;
        do {
            System.out.println("Gravedad del paciente");
            System.out.println("1. Gravedad baja");
            System.out.println("2. Gravedad media");
            System.out.println("3. Gravedad Alta");
            System.out.println("4. Gravedad muy alta");
            menu = input.nextInt();
            switch (menu){
                case 1:
                    System.out.println("El paciente es de gravedad baja");
                    gravedad = 1;
                case 2:
                    System.out.println("El paciente es de gravedad media");
                    gravedad = 2;
                case 3:
                    System.out.println("El paciente es de gravedad Alta");
                    gravedad = 3;
                case 4:
                    System.out.println("El paciente es de gravedad muy alta");
                    gravedad = 4;
            }
        }while (menu != 1 && menu != 2 && menu != 3 && menu != 4);
        return gravedad;
    }
}