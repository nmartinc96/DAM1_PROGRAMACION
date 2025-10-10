package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_21b {
    static void main(String[] args) {
         // Realiza un programa que permita la entrada de varios números y calcule su media.

        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;

        System.out.println("Introduce números para calcular su media. Cuando hayas acabado de introducir numeros pulsa cualquier letra.");

        while (true) {
            System.out.print("Introduce un número: ");
            if (scanner.hasNextDouble()) {
                double numero = scanner.nextDouble();
                suma += numero;
                contador = contador + 1;
            } else {
                break;
            }
        }

            double media = suma / contador;
            System.out.println("Has introducido " + contador + " números.");
            System.out.println("La media es: " + media);


        scanner.close();
    }
}