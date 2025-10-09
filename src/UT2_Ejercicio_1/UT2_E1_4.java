package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_4 {
    static void main(String[] args) {
        //Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo. Se debe comprobar que el divisor no puede ser cero
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entero");
        int n1 = sc.nextInt();
        System.out.println("Escribe un número entero distinto a 0");
        int n2 = sc.nextInt();

        if (n2 == 0) {
            System.out.println( "El 0 no es un comando válido.");
        } else {
            System.out.println("El resultado de " + n1 + " divido " + n2 + " es igual a " + (n1/n2));
        }

    }

}
