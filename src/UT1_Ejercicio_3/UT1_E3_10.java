package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_10 {
    static void main(String[] args) {
// Desarrolla un programa que solicite 3 números y compruebe si están ordenados.

        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee un numero");
        int n1 = sc.nextInt();
        System.out.println("Teclee un numero");
        int n2 = sc.nextInt();
        System.out.println("Teclee un numero");
        int n3 = sc.nextInt();
         if (n1 < n2 && n2 < n3)
         {
             System.out.println("sus numeros están ordenados");
         }
         else
         {
             System.out.println("sus numeros no están ordenados");
         }

        sc.close();
    }
}
