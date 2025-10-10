package UT2_Ejercicio_1;

import java.util.Scanner;

public class UT2_E1_23 {
    static void main(String[] args) {
        //Desarrolla un programa que lea números hasta que se den cinco ceros y escriba después la suma de los números leídos.
        //Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0
        //Da como salida: 33

        Scanner sc = new Scanner(System.in);
        int n;
        int contador = 0;
        int suma = 0;

        while (contador < 5) {
            System.out.println("Escribe un numero");
            n = sc.nextInt();
            suma += n;
            if (n == 0){
                contador += 1;
            }
        }
        System.out.println("La suma de todos sus numeros es igual a " + suma);

        sc.close();
    }
}
