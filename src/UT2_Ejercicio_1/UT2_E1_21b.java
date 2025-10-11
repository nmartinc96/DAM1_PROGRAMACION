package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_21b {
    static void main(String[] args) {
         // Realiza un programa que permita la entrada de varios números y calcule su media.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int n1 = sc.nextInt();
        System.out.println("Escriba otro numero");
        int n2 = sc.nextInt();
        System.out.println("Escriba otro numero");
        int n3 = sc.nextInt();

        int suma = n1 + n2 + n3;
        int media = suma / 3;

        System.out.println("La media de sus numeros es " + media);
    }
}
