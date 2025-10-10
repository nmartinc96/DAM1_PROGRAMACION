package UT1_Ejercicio_1;

public class UT1_E1_09 {
    static void main(String[] args) {
// Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A continuación, realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        System.out.println("El valor de A es " + A);
        System.out.println("El valor de B es " + B);
        System.out.println("El valor de C es " + C);
        System.out.println("El valor de D es " + D);
        //B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
        B = C;
        C = A;
        A = D;
        D = B;
        System.out.println("Ahora B tiene el valor de C, por ello ahora B es " + B);
        System.out.println("Ahora C tiene el valor de A, por ello ahora C es " + C);
        System.out.println("Ahora A tiene el valor de D, por ello ahora A es " + A);
        System.out.println("Ahora D tiene el valor de B, por ello ahora D es " + D);

    }
}
