package UT2_Ejercicio_2;

import java.util.Scanner;

public class UT2_E2_01 {
    static void main(String[] args) {
        // Crea un programa que te pida la altura de un triángulo rectángulo y lo muestre con asteriscos. Ejemplo con 4:
        //*
        //**
        //***
        //****

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del triángulo: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        sc.close();
    }
}
