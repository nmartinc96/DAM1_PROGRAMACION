package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_14 {
    static void main(String[] args) {
         //Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Escribe un número que sea mayor o igual que 0");
            n = sc.nextInt();
        } while ( n < 0);
        System.out.println("Tu numero elegido es el " + n );

        sc.close();
    }
}
