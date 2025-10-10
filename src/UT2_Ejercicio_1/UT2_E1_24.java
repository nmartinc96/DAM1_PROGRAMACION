package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_24 {
    static void main(String[] args) {
        //Pedir un número entre 0 y 9.999, decir si es capicúa

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entre 0 y 9.999 para saber si es capicúa");
        int n = sc.nextInt();
        int m = n/ 1000;
        n= n%1000;
        int c = n/100;
        n = n%100;
        int d = n/10;
        n = n%10;

        if (m == n == )
    }
}
