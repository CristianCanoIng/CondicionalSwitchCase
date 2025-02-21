package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Switch Case Nuevo Ejemplo\n");

        //Escoja una opcion
        System.out.println("Escoja: 1 2 3");
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = teclado.nextInt();

        String mensaje = switch (numeroIngresado) {
            case 1 -> "La opcion es uno";
            case 2 -> "La opcion es dos";
            case 3 -> "La opcion es tres";
            default -> "No esta en las opciones";
        };
        System.out.println(mensaje);

        //Otra forma
        /*String tipoOpcion = switch (numeroIngresado) {
            case 1, 2, 3 -> " Opcion en lista";
            default -> "No esta esta opcion";
        };*/
    }
}
