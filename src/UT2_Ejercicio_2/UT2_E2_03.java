package UT2_Ejercicio_2;

import javax.swing.*;
import java.util.Scanner;

public class UT2_E2_03 {
   public static void main(String[] args) {
       // Crea un programa en el que introduzcas una nota del 1 al 10 y te indique su nota en formato escrito (insuficiente, suficiente, etc.).

       Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca un número entre 1 y 10, para saber si su nota es suficiente, insuficiente...");
       int n = sc.nextInt();

       if (n < 1 || n > 10) {
           System.out.println(" El número elegido no es valido");
       } else {
           if (n >= 1 && n < 5) {
               System.out.println("Su nota es insuficiente.");
           } else if (n == 5) {
               System.out.println("Su nota es suficiente.");
           } else if (n == 6) {
               System.out.println("Su nota es bien.");
           } else if (n == 7 || n == 8) {
               System.out.println("Su nota es notable.");
           } else if (n == 9 || n == 10) {
               System.out.println("Su nota es sobresaliente.");
           }
       }

           sc.close();
       }
   }
