package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_03 {
    static void main(String[] args) {
        // Desarrolla un programa que, dado un número entre el 1 y el 7, indique el día de la semana del que se trata.

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número del 1 al 7");
        int n = sc.nextInt();

        if (n == 1){
            System.out.println("El número elegido corresponde al lunes");
        } else if (n == 2) {
            System.out.println("El número elegido corresponde al martes");
        } else if (n == 3) {
            System.out.println("El número elegido corresponde al miércoles");
        } else if (n == 4) {
            System.out.println("El número elegido corresponde al jueves");
        } else if (n == 5) {
            System.out.println("El número elegido corresponde al viernes");
        } else if (n == 6) {
            System.out.println("El número elegido corresponde al sábado");
        } else if (n == 7) {
            System.out.println("El número elegido corresponde al domingo");
        } else {
            System.out.println("Tu número elegido no es válido");
        }

        sc.close();
    }
}
