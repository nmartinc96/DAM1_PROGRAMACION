package UT2_Ejercicio_2;

import java.util.Scanner;

public class UT2_E2_10 {
    static void main(String[] args) {
        // Igual que el anterior, pero el valor de N se leerá por teclado.

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números de la serie de Fibonacci quieres ver?");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++){
            System.out.println( a + " ");
            int siguiente = a+b;
            a = b;
            b = siguiente;
        }

        sc.close();
    }
}
