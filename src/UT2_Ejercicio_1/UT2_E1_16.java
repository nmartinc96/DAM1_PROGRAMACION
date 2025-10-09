package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_16 {
    static void main(String[] args) {
        //Desarrolla un programa que dado el día y mes de nacimiento te indique cuáles tu signo del zodiaco.

        // Revisar, si pongo 45 de sale bien

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el día que naciste");
        int dia = sc.nextInt();
        System.out.println("introduce el mes que naciste");
        int mes = sc.nextInt();

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Eres Acuario");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.println("Eres Piscis");
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Eres Aries");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Eres Tauro");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Eres Géminis");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Eres Cáncer");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Eres Leo");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Eres Virgo");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Eres Libra");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Eres Escorpio");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Eres Sagitario");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Eres Capricornio");
        } else {
            System.out.println("La fecha introducida no es válida");
        }
    }
}
