package examenfinalipc1;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el numero de filas: \n");
       int tamano = sc.nextInt();
       int n = 1;
       
       if (tamano%2==1) {
            for(int j = 0; j < (tamano/2)+1; j++) {
                for(int i = tamano - 1; i > j; i--) {
                    System.out.print(" ");
                }
                for(int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                n += 2;
                System.out.println();
            }
        }
    }
}