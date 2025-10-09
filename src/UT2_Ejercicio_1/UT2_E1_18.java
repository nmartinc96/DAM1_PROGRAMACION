package UT2_Ejercicio_1;

public class UT2_E1_18 {
    static void main(String[] args) {
        // Escribir un programa en Java que multiplique los 20 primeros números naturales (1*2*3*4*5…).
        long n = 1;

        for ( int i = 1; i <= 20; i = i +1) {
            n= n * i;
        }
        System.out.println(n);
    }

}



