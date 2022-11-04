package examenfinalipc1;

import java.util.Scanner;

public class ExamenFinalIPC1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero \n");
        int a = sc.nextInt();
        
        System.out.print("Ingrese el segundo numero \n");
        int b = sc.nextInt();
        
        if(a>b){
            System.out.print("El primer numero es mayor \n");
        } else {
            System.out.print("El segundo numero es mayor \n");
        }
    }
}