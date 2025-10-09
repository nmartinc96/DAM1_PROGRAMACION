package UT1_Ejercicio_2;

import java.util.Scanner;

public class UT1_E2_8 {
    static void main(String[] args) {
//Programa que lee un número de 3 cifras y muestra sus cifras por separado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero de tres cifras");
        int n = sc.nextInt();
        int centenas = n/100;
        int decenas = (n/10) % 10;
        int unidades = n % 10;
        System.out.println("Tu primer numero es el " + centenas);
        System.out.println("Tu segundo numero es el " + decenas);
        System.out.println("Tu tercer numero es el " + unidades);
        sc.close();
    }
}
