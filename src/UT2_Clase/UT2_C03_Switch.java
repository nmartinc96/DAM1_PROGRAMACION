package UT2_Clase;

import java.util.Scanner;

public class UT2_C03_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una posición");
        int posicion = sc.nextInt();

        switch (posicion) {
            case 1:
                System.out.println("David");
                break;
            case 2:
                System.out.println("Antonio");
                break;
            case 3:
                System.out.println("Juan Carlos");
                break;
            default:
                System.out.println("Gabriel");
                break;
        }

        sc.close();

    }
}