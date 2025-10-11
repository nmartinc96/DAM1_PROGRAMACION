package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_21 {
    static void main(String[] args) {
         // Realiza un programa que permita la entrada de varios números y calcule su media.

        Scanner scanner = new Scanner(System.in);
        int n;
        double suma = 0;
        double contador = 0;

        System.out.println("Escriba un numero para posteriormente calcular la media de los elegidos, si quiere salir teclee algun numero en negativo");
        n = scanner.nextInt();

        while (n >= 0) {
            suma += n;
            contador += 1;
            n = scanner.nextInt();
        }
        if (contador > 0) {
            System.out.println("La media de los numeros marcados es " + suma / contador);
        } else {
            System.out.println("Los valores introducidos no siven, pruebe numero mayores a 0");
        }

        scanner.close();

    }
}