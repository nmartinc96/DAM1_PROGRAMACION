package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_9 {
    public static void main(String[] args) {
 // Desarrolla un programa que indique el peso que tienes en la luna. Gravedad en la tierra 9,8 y en la luna 1,62.

        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee su peso en Kg");
        double peso = sc.nextDouble();
        double pesoluna = peso * 1.62 / 9.8;
        System.out.println(" Su peso en la luna sería " + pesoluna);

        sc.close();
    }
}
