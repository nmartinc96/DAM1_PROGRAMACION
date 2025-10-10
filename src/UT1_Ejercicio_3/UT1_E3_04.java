package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_04 {
    public static void main(String[] args) {
// Desarrolla un programa que compruebe si un número introducido por teclado es múltiplo de 7.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        int n = sc.nextInt();
        if (n%7 == 0)
        {System.out.println("El numero " + n + " es multiplo de 7.");}
        else
        {System.out.println("El numero " + n + " no es multiplo de 7.");}
        sc.close();
    }
}
