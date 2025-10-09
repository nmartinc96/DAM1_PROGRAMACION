package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_14 {
     static void main(String[] args) {
// Realiza un programa que calcule cuántos billetes hay que darle a un cliente que quiera sacar cierta cantidad de dinero de su banco. Siempre calcularemos la mínima cantidad de billetes.

        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee el dinero que desea sacar. Recuerde que solo pueden ser multiplos de 5.");
        int dinero = sc.nextInt();

        if (dinero % 5 != 0)
        {
            System.out.println("Recuerde que solo pueden retirar cantidades que sean multiplos de 5");
        }
        else
        {
        int cien = dinero / 100;
        dinero = dinero % 100;

        int cincuenta = dinero / 50;
        dinero = dinero % 50;

        int veinte = dinero / 20;
        dinero = dinero % 20;

        int diez = dinero / 10;
        dinero = dinero % 10;

        int cinco = dinero / 5;

            System.out.println("Usted va a retirar " + cien + " billetes de 100");
            System.out.println("Usted va a retirar " + cincuenta + " billetes de 50");
            System.out.println("Usted va a retirar " + veinte + " billetes de 20");
            System.out.println("Usted va a retirar " + diez + " billetes de 10");
            System.out.println("Usted va a retirar " + cinco + " billetes de 5");

        }

    }
}
