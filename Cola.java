package colaprac;

import java.util.Scanner;

public class Cola {

    int tope, max, FRENTE, FINAL;
    Persona[] cola;  //declarando mi arreglo pila de tipo CAlumno
    Persona perso = new Persona();//creando un objeto de CAlumno

    static Scanner teclado = new Scanner(System.in);

    public Cola(int max) {
        this.max = max;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.cola = new Persona[this.max + 1];

    }

    public Cola() {
        this.max = 100;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.cola = new Persona[this.max + 1];
    }

    public boolean IsColaLlena() {
        if (this.FINAL == this.max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsColaVacia() {
        if (this.FRENTE == this.FINAL) {
            return true;
        } else {
            return false;
        }
    }

    public void InsertarCola() {
        if (this.IsColaLlena()) {
            System.out.println("La Pila esta Llena");
        } else {
            //codigo
            System.out.println("Ingrese el Código del trabajador: ");
            String codigo = teclado.next();
            perso.setCodigo(codigo);

            //nombre
            System.out.println("Ingrese el Nombre del trabajador: ");
            String nom = teclado.next();
            perso.setNombre(nom);
            //nota 1
            System.out.println("Ingrese la Horas trabajadas:  ");
            int h = teclado.nextInt();
            perso.setHora(h);
            //nota2
            System.out.println("Ingrese la tarifa: ");
            int t = teclado.nextInt();
            perso.setTarifa(t);

            System.out.println("Se inserto a la cola");
            System.out.println(perso.Mostrar());
            this.tope++;

        }

    }

    public void MostrarCola() {
        if (this.IsColaVacia()) {
            System.out.println("La pila esta vacía");
        } else {
            for (int i = 0; i < this.tope; i++) {
                System.out.println(perso.Mostrar());
                tope--;
            }

        }

    }

    public void EliminarCola() {
        if (this.FRENTE == this.FINAL) {
            System.out.println("La cola esta Vacia");
        } else {
            for (int i = FRENTE; i <= FINAL - 1; i++) {
                cola[i] = cola[i + 1];
            }
            System.out.println("Elemento Eliminado....");
            FINAL--;
        }
    }

    public void VaciarCola() {
        FRENTE = 0;
        FINAL = 0;
        System.out.println("Elementos Eliminados.......");
    }

}
