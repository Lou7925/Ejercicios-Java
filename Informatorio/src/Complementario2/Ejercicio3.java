package Complementario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List <Integer> cartas= new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13));
        System.out.println("Imprime las cartas de la baraja frances:"+cartas);
        Collections.reverse(cartas);
        System.out.println("Imprime las cartas de atras hacia adelante:"+cartas);       
        Collections.shuffle(cartas);
        System.out.println("Imprime las cartas desordendamente:"+cartas);
    }
    
}
