package UT2_Ejercicio_2;

public class UT2_E2_08 {
    public static void main(String[] args) {
        // Muestra los números primos entre 1 y 100.

        System.out.println(" Los números primos  entre 1 y 100 son: ");

        for(int i = 2; i <=100; i++){
            boolean primo = true;

            for (int j = 2; j< i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
        if (primo) {
                    System.out.println(i);
                }
            }
        }

    }

