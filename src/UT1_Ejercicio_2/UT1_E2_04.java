package UT1_Ejercicio_2;

import java.util.Scanner;

public class UT1_E2_04 {
    static void main(String[] args) {
// Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero  y a continuacion presiona enter");
        int numero = sc.nextInt();
        System.out.println("El doble del numero que elegiste es " + (numero * 2));
        System.out.println("El triple del numero que elegiste es " + (numero * 3));
        sc.close();

    }
}
