package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_19 {
    static void main(String[] args) {
        //Escribir un programa en Java que lea un número entero por el teclado e imprima todos los números impares menores que él.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        int n = sc.nextInt();

        System.out.println("Los numeros impares inferiores a " + n + " son:");
        for (int i = 1; i < n; i = i + 1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


    }
}
