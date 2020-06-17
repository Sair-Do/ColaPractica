package colaprac;

import java.util.Scanner;

public class AplicaCola {

    static Cola Cola;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] argv) {
        MenuCola();
    }

    static void creaCola() {
        int tam;
        System.out.println("Ingrese el tamaño de la cola: ");
        tam = teclado.nextInt();
        Cola = new Cola(tam);
        System.out.println("Cola cerrada.....");
    }

    public static void MenuCola() {
        int opcion;

        do {
            System.out.println("=================");
            System.out.println("Menu de Opciones");
            System.out.println("=================");
            System.out.println("[1] Crear Cola");
            System.out.println("=================");
            System.out.println("[2] Ingresar Datos");
            System.out.println("[3] Mostrar Datos");
            System.out.println("[4] Eliminar Datos");
            System.out.println("[5] Vaciar Cola");
            System.out.println("==================");
            System.out.println("[0] Salir");
            System.out.println("==================");

            System.out.println("Ingrese una alternativa: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    creaCola();
                    break;
                case 2:
                    Cola.InsertarCola();
                    break;
                case 3:
                    Cola.MostrarCola();
                    break;
                case 4:
                    Cola.EliminarCola();
                    break;
                case 5:
                    Cola.VaciarCola();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese Opcion Correcta....");
                    break;
            }
        } while (true);
    }

}
