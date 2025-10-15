package UT2_Ejercicio_2;

public class UT2_E2_02 {
    static void main(String[] args) {
        // Realizar un programa que calcule la potencia de un número base exponente. La potencia se hará por medio de multiplicaciones, está prohibido usar Math.pow()

        int base = 2;
        int exponente = 5;
        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;

        }
        System.out.println("El resultado es " + resultado);
    }
}
