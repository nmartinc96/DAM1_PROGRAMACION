package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_24 {
    static void main(String[] args) {
        //Pedir un número entre 0 y 9.999, decir si es capicúa

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entre 0 y 9.999 para saber si es capicúa");
        int n = sc.nextInt();

        while (n < 0 || n > 9999) {
            System.out.println("Numero no valido, elija otro");
            n = sc.nextInt();
        }


        int original = n;
        int invertido =0;

        while (n > 0){
            int digito = n%10;
            invertido = invertido * 10 + digito;
            n /= 10;
        }

        if (original == invertido){
                System.out.println("El número " + original +" es capicua" );
            } else {
                System.out.println("El número " + original +" no es capicua");
            }

        sc.close();

        }
    }

