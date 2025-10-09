package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_20 {
    static void main(String[] args) {
        //Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de los 100 número siguientes, mostrando el resultado en pantalla

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entero");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = n; i <= n +100; i = i + 1) {
            suma = suma + i;
        }
        System.out.println("La suma de los 100 número siguientes a " + n + " es igual a " + suma);
    }
}
