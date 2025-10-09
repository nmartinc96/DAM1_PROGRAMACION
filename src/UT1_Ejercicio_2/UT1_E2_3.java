package UT1_Ejercicio_2;

import java.util.Scanner;

public class UT1_E2_3 {
    static void main(String[] args) {
// Escribe un programa que recoja por teclado tu nombre y luego lo muestre por pantalla.
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu nombre, y a continuación presiona enter ");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre);
        sc.close();
    }
}
