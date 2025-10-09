package UT1_Ejercicio_2;

import java.util.Scanner;

public class UT1_E2_5 {
    static void main(String[] args) {
// Escribe un programa para que muestre tu dirección y tu número de teléfono. Asegúrate de que los datos se muestran en líneas separadas.
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, escriba su direccion");
        String direccion = sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Por favor, marque su numero de movil");
        int movil = sc2.nextInt();
        System.out.println("Su direccion es " + direccion + ", y su numero de movil es " + movil);
        sc.close();
    }
}
