package Complementario2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer>numeros=new ArrayList<Integer>();
        System.out.println("Por favor ingrese 5 numeros: ");
        Scanner scan = new Scanner(System.in);
        for (int i=1; i<=5;i++){
            int num= scan.nextInt();
            numeros.add(num);
        }
        System.out.println("Los elementos de la lista son: "+numeros);
        System.out.println("El tamano de la lista es: "+numeros.size());
        
        System.out.println("Por favor ingrese un numero: ");
        int num1= scan.nextInt();
        numeros.add(0, num1);
        System.out.println("Por favor ingrese otro numero: ");
        int num2= scan.nextInt();
        numeros.add(numeros.size(), num2);

        System.out.println("Los elementos de la lista son: "+numeros);
        System.out.println("El tamano de la lista es: "+numeros.size());
    }

    

}
