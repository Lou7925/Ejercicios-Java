package Complementario1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Por favor ingresa dos numero: ");
        Scanner scan = new Scanner (System .in);
        int numero = scan.nextInt();
        int numero2 = scan.nextInt();
        int suma = numero +  numero2;
        int resta = numero - numero2;
        System.out.println("El resultado de la suma: "+ suma);
        System.out.println("El resultado de la resta: "+ resta);
        System.out.println("El resultado de la division es: "+ numero / numero2);
        System.out.println("El resultado de la multiplicacion es: "+ numero*numero2 );
        System.out.println("El resultado del modulo es: "+ numero%numero2 );
    }
}
