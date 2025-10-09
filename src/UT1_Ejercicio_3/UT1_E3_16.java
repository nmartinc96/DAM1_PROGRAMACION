package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_16 {
    static void main(String[] args) {
// Mostrar la tabla de multiplicar de un número.
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee un número entero");
        int n = sc.nextInt();

        System.out.println("Numero elegido  \t Multiplipicado por  \t Es igual a");
        System.out.println(n + "                    \t 1                    \t" +  n);
        System.out.println(n + "                    \t 2                    \t" + (n*2));
        System.out.println(n + "                    \t 3                    \t" + (n*3));
        System.out.println(n + "                    \t 4                    \t" + (n*4));
        System.out.println(n + "                    \t 5                    \t" + (n*5));
        System.out.println(n + "                    \t 6                    \t" + (n*6));
        System.out.println(n + "                    \t 7                    \t" + (n*7));
        System.out.println(n + "                    \t 8                    \t" + (n*8));
        System.out.println(n + "                    \t 9                    \t" + (n*9));
        System.out.println(n + "                    \t 10                   \t" + (n*10));


    }
}
