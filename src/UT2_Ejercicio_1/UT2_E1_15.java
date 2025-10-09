package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_15 {
    static void main(String[] args) {
        //Mostrar la tabla de multiplicar de un número.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int n = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + n);
        System.out.println("1   \tx     \t" + n + " = \t" + n*1);
        System.out.println("2   \tx     \t" + n + " = \t" + n*2);
        System.out.println("3   \tx     \t" + n + " = \t" + n*3);
        System.out.println("4   \tx     \t" + n + " = \t" + n*4);
        System.out.println("5   \tx     \t" + n + " = \t" + n*5);
        System.out.println("6   \tx     \t" + n + " = \t" + n*6);
        System.out.println("7   \tx     \t" + n + " = \t" + n*7);
        System.out.println("8   \tx     \t" + n + " = \t" + n*8);
        System.out.println("9   \tx     \t" + n + " = \t" + n*9);
        System.out.println("10  \tx     \t" + n + " = \t" + n*10);




    }
}
