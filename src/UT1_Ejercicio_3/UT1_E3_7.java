package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_7 {
    static void main(String[] args) {
// Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
       Scanner sc = new Scanner(System.in);
       System.out.println("Escribe un carácter en  mayúsculas o en minúsculas");
       char c = sc.next().charAt(0);

       if (c >= 'A' && c <= 'Z')
       {
           System.out.println("El carácter " + c + " esta en mayúsculas");
       }
       else
       {
           System.out.println("El carácter " + c + " esta en minúsculas");
       }
       sc.close();
    }
}
