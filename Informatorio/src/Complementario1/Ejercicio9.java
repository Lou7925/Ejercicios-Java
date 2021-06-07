package Complementario1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Por favor coloque una palabra o frase: ");
        String frase=sc.nextLine();
        System.out.println("Por favor coloque la letra que desea contar: ");
        String letra_contar=sc.nextLine();
        char letra=letra_contar.charAt(0);
        int contador=0;
        for(int i=0 ; i<frase.length(); i++){
            char letra_frase=frase.charAt(i);
            if (letra == letra_frase){
                contador = contador+1;
                }
        }
        System.out.println(contador);
        
    }
}