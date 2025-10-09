package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_5 {
    public static void main(String[] args) {
// Programa que lea dos caracteres por teclado y compruebe si son iguales.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un caracter");
        String c1 = sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Escribe de nuevo un caracter");
        String c2 = sc.nextLine();
        if (c1 == c2)
        {
            System.out.println("Ha escrito dos veces el mismo caracter");
        }
        else
        {
            System.out.println("Ha escrito dos caracteres diferentes");
        }
        sc.close();
    }
}
