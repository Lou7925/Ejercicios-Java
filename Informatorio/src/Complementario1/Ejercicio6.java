package Complementario1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Por favor coloque dos numeros: ");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int potencia=1;
        for(int x=1; x<=num2; x++){
            potencia=potencia*num1;
        }
        System.out.println(potencia);
    }   
}
