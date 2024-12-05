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

    private static void mostrarListaEspera() {
    }

    private static void agregarPaciente() {
        String nombre, apellido, motivoOperacion;

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

            Paciente nuevoPaciente = new Paciente(nombre, apellido, motivoOperacion);
            listaEspera.add(nuevoPaciente);
            System.out.println("Paciente añadido a la lista de espera.");

        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Por favor, inténtalo de nuevo.");
        } catch (Exception e) {
            System.out.println("ERROR inesperado: " + e.getMessage());
        }
    }
}