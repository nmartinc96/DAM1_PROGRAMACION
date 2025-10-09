package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_2 {
    static void main(String[] args) {
        // Calcular el mayor de tres números enteros en Java.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entero");
        int n1 = sc.nextInt();
        System.out.println("Escribe otro número entero");
        int n2 = sc.nextInt();
        System.out.println("Escribe otro número entero");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("El número " + n1 + " es el mayor");
        } else if (n2 > n1 && n2 > n3){
            System.out.println("El número " + n2 + " es el mayor");
        } else {
            System.out.println("El número " + n3 + " es el mayor");
        }

        sc.close();
    }
}
