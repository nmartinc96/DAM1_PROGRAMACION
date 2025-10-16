package UT2_Ejercicio_2;

import java.util.Scanner;

public class UT2_E2_04 {
    public static void main(String[] args) {
        //Desarrolla un programa que pida un número por teclado y te muestre el número de cifras que tiene.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero para saber cuantas cifras tiene");
        int n = sc.nextInt();
        int contador = 0;

        if (n < 0) {
            n = n * -1;
        }
        if (n == 0){
            System.out.println("El numero elegido tiene una cifra");
        } else {
            while (n > 0) {
                n = n / 10;
                contador++;
            }
            System.out.println("El numero elegido tiene " + contador + " cifras");
        }

        sc.close();
    }
}
