package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_1 {
    static void main(String[] args) {
        // Programa Java que lea un número entero y calcule si es par o impar.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        int n = sc.nextInt();

        if (n%2 == 0)
        {
            System.out.println("El número elegido es par");
        }
        else
        {
            System.out.println("El número elegido es impar");
        }
        sc.close();
    }
}
