package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_13 {
    public static void main(String[] args) {
// Realiza un programa que nos pida cuantos segundos duró un concierto, y nos calcule cuántas horas, minutos y segundos son.
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea cuantos segundos duró el concierto");
        int seg = sc.nextInt();

        int horas = seg / 3600;
        seg = seg % 3600;

        int minutos = seg /60;
        seg = seg % 60;

        int segundos = seg;

        System.out.println("El concierto duro " + horas + "horas, " + minutos + " minutos y " + segundos + " segundos");

        sc.close();
    }
}
