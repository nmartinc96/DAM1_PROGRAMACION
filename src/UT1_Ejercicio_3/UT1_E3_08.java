package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_08 {
    public static void main(String[] args) {
// Crea un programa que compruebe si un año es bisiesto.  “Año bisiesto es el divisible entre 4, salvo que sea año secular -último de cada siglo, terminado en «00»-, en cuyo caso también ha de ser divisible entre 400.”

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int a = sc.nextInt();
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
        {
            System.out.println(a + " es un año bisiesto.");
        }
        else
        {
            System.out.println(a + " no es un año bisiesto.");
        }

        sc.close();
    }
}
