package UT2_Ejercicio_2;

import java.util.Scanner;

public class UT2_E2_03 {
    static void main(String[] args) {
        // Crea un programa en el que introduzcas una nota del 1 al 10 y te indique su nota en formato escrito (insuficiente, suficiente, etc.).

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entre 1 y 10, para saber si su nota es suficiente, insuficiente...");
        int n = sc.nextInt();

        if ( n < 1 || n > 10);{
        System.out.println(" El número elegido no es valido");
        n = sc.nextInt();
        } else if (n > 1 || n < 5 ){
            System.out.println(" Su nota es insuficiente ");
        }else if (n > 5 || n < 7 ) {
            System.out.println(" Su nota es suficiente  ");
        } else if (n > 7 || n < 9 ){
            System.out.println(" Su nota es notable ");
    }
}
