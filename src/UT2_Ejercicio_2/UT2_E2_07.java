package UT2_Ejercicio_2;

import java.util.Scanner;

public class UT2_E2_07 {
    public static void main(String[] args) {
        // Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).

        Scanner sc = new Scanner(System.in);
        System.out.println("Vas a tener que escribir dos números enteros, primero uno menor y luego otro mayor. Escribe primero el número menor y pulsa enter");
        int n1 = sc.nextInt();
        System.out.println("Escribe ahora el número mayor y pulsa enter");
        int n2 = sc.nextInt();

        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);

        System.out.println("10 números aleatorios entre " + min + " y " + max + ":");

        for (int i = 0; i < 10; i++) {
            int aleatorio = (int)(Math.random() * (max - min + 1)) + min;
            System.out.println(aleatorio);
        }

        sc.close();

    }
}
