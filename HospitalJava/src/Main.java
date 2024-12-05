import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
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
            menu = input.nextInt();
            switch (menu){

            }
        }while (menu != 5);
    }
}