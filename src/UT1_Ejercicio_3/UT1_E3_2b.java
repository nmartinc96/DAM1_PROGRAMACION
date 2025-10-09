package UT1_Ejercicio_3;

public class UT1_E3_2b {
   public static void main(String[] args) {
// Programa que lea un número entero y muestre si el número es múltiplo de 10.
        int n = 45;
        System.out.println((n %10 == 0)
                ? "El numero " + n + " es multiplo de 10"
                : "El numero " + n + " no es multiplo de 10");
    }
}
