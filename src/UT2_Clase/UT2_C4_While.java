package UT2_Clase;

import java.util.Scanner;

public class UT2_C4_While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = -1;
        while (numero != 0) {
            System.out.println("Introduce un número y te doy el doble");
            numero = sc.nextInt();
            System.out.println("El doble de " + numero + " es " + numero * 2);
        }


    }
}
