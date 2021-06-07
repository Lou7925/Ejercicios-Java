package Complementario1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese una palabra: ");
        Scanner scan= new Scanner(System.in);
        String palabra= scan.nextLine();
        String resultado="";
        for(int i=0; i<palabra.length(); i++){
            char caracter=' ';
            int x=palabra.charAt(i);
            //Se agrega el if solo para letras que ya estan en Mayuscula
            //if(x>96 && x<123) {
                x = x-32; 
            //}
            caracter=(char)x;
            resultado = resultado + caracter;
        }
        System.out.println(resultado);
    }
}
