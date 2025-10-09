package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_3 {
    public static void main(String[] args) {
// Crea un programa que compruebe si eres mayor de edad.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        int n = sc.nextInt();
        if (n >= 18)
        {System.out.println("Eres mayor de edad");}
        else
        {System.out.println("Eres menor de edad");}
        sc.close();
    }
}
