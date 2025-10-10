package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_22 {
    static void main(String[] args) {
        // Desarrolla un programa que lea números hasta que se introduzca un número negativo y después indique si se ha dado el mismo número dos veces consecutivas:
        //Introduciendo: 1 3 5 3 4 6 7 –1
        //Da como salida: No
        //Introduciendo: 1 3 5 6 6 4 3 –1
        //Da como salida : Si

    Scanner sc = new Scanner(System.in);
        System.out.println("Escribe números, cuando quieras parar escribe un numero negativo");
        int n = sc.nextInt();
        int anterior = 15632476;
        int contador = 0;

        while (n >= 0) {
            if (n == anterior){
                contador += 1;
            }
            anterior = n;
            n = sc.nextInt();
        }
        if (contador >0 ) {
            System.out.println( "Alguno de los numeros elegidos se ha repetido consecutivamente ");
        } else {
            System.out.println( "Ninguno de los numeros elegidos se ha repetido consecutivamente ");
        }

    sc.close();
    }
}