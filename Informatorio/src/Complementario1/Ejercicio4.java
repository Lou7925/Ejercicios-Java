package Complementario1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Por favor coloque un numero: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//parecido al imput
        int fact = 1;
        for(int x = 1 ; x <= n ; x++){//(inicialización; condición; incremento/decremento) 
            fact = fact * x;
        }
        System.out.println(fact);
    }
}