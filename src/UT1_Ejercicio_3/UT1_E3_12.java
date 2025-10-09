package UT1_Ejercicio_3;

import java.util.Scanner;

public class UT1_E3_12 {
     static void main(String[] args) {
//Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA será una constante del 21%.

       Scanner sc =new Scanner(System.in);
       System.out.println("Tecle el precio del producto");
       double precio = sc.nextDouble();

       System.out.println("El precio final del producto con IVA es " + precio * 1.21);

       sc.close();
    }
}
