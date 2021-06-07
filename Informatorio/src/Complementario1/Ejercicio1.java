package Complementario1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.print("Por favor ingrese su nombre: ");
        Scanner scan = new Scanner (System .in);
        String nombre = scan.nextLine(); 
        System.out.println("Hola "+ nombre);
    }
}

