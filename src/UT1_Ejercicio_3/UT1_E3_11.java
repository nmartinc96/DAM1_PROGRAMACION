package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_11 {
    static void main(String[] args) {
// Crea un programa que pida cuál es el radio de una circunferencia y nos calcule cuál es la longitud y el área.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe cuál es el radio de una circunferencia");
        int radio = sc.nextInt();
        double longitud = 2 * 3.14159 * radio;
        double area = 3.14159 * (radio * radio);

        System.out.println( "Si el radio de la circunferencia es " + radio + " la longitud de esta es " + longitud + "y el área es " + area);

        sc.close();
    }
}
