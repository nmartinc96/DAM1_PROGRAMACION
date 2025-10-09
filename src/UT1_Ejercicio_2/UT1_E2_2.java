package UT1_Ejercicio_2;

public class UT1_E2_2 {
    static void main(String[] args) {
// Programa Java que declare una variable C de tipo entero y asígnale un valor. A continuación, muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
        int C = 43;
        System.out.println((C >= 0)
                ? "El numero " + C + " es positivo"
                : "El numero " + C + " es negativo");
        System.out.println((C %2 == 0)
                ? "El numero " + C + " es par"
                : "El numero " + C + " es impar");
        System.out.println((C %5 == 0)
                ? "El numero " + C + " es multiplo de 5"
                : "El numero " + C + " no es multiplo de 5");
        System.out.println((C %10 == 0)
                ? "El numero " + C + " es multiplo de 10"
                : "El numero " + C + " no es multiplo de 10");
        System.out.println((C > 100)
                ? "El numero " + C + " es mayor de 100"
                : "El numero " + C + " es menor de 100");
    }
}
