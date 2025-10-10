package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_06 {
    public static void main(String[] args) {
// Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo. Se debe comprobar que el divisor no puede ser cero.

        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero entero");
        int n1 = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Pon un numero entero distinto a 0");
        int n2 = sc.nextInt();

        if (n2 == 0)
        {
            System.out.println("El numero elegido no es valido, eliga uno distinto a 0");
        }
        else
        {
            System.out.println("El resultado es " + n1/n2);
        }
        sc.close();
    }
}
