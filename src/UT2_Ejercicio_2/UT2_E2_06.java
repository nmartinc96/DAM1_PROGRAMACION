package UT2_Ejercicio_2;

import java.util.Scanner;

public class UT2_E2_06 {
    public static void main(String[] args) {
        // Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el nuúmero de ventas realizadas");
        int ventas = sc.nextInt();
        double sumatorio = 0;

        for (int i = 1; i <= ventas; i++) {
            System.out.println("Indique el precio de la compra numero " + i + " :");
            double euros = sc.nextDouble();
            sumatorio += euros;
        }

        System.out.println("Usted ha vendido un total de " + ventas + " productos y ha obtenido un total de " + sumatorio + " euros");

        sc.close();
    }
}
