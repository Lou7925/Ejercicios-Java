package Complementario1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Por favor coloque 2 numeros: ");
        Scanner scan= new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int multiplicacion=0 ;
        for (int x= 1; x <= num2; x++){
            multiplicacion = multiplicacion + num1;
        }
        System.out.println(multiplicacion);

    }
}
