package UT1_Ejercicio_2;

import java.util.Scanner;

public class UT1_E2_07 {
    static void main(String[] args) {
//Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la velocidad en Km/h");
        double vkmh = sc.nextDouble();
        System.out.println( "Tu velodicad pasada a m/s es " + (vkmh * 1000/3600));
        sc.close();
        }
    }

