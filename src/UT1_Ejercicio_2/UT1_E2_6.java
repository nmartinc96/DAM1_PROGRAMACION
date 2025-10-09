package UT1_Ejercicio_2;

import java.util.Scanner;

public class UT1_E2_6 {
    static void main(String[] args) {
// Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero entero ");
        int n1 = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Escriba otro numero entero");
        int n2 = sc2.nextInt();
        System.out.println("Sus numero elegidos son el " + n1 + " y el " + n2);
        sc.close();
    }
}
