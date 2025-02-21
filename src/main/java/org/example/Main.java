package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Switch Case Viejo Ejemplo\n");

        //Escoja una opcion
        System.out.println("Escoja: 1 2 3");
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = teclado.nextInt();

        switch (numeroIngresado) {
            case 1:
                System.out.println("Opcion 1");
                break;
            case 2:
                System.out.println("Opcion 2");
                break;
            case 3:
                System.out.println("Opcion 3");
                break;
            default:
                System.out.println("No esta dentro de las opciones");
                break;
        }
    }
}
