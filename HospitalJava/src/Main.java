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
                    break;
                case 2:
                    System.out.println("Has seleccionado 'Ver la lista de espera'");
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
        }while (menu != 5);
    }
}