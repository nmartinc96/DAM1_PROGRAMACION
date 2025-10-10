package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_05 {
    static void main(String[] args) {
        // Crea un programa que pide tu edad y compruebe si puedes votar.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su edad");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad y puedes votar");
        } else {
            System.out.println("Eres menor de edad y no puedes votar");
        }

        sc.close();
    }
}
