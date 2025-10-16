package UT2_Ejercicio_2;
import java.util.Scanner;

public class UT2_E2_05 {
    public static void main(String[] args) {
        // Desarrolla un programa que solicite un número n y luego muestre por pantalla la siguiente figura:
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        //………….
        //1 2 3 4 5 …..n

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
