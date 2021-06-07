package Complementario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int limiteInferior;
        int limiteSuperior;
        do{
            System.out.println("Por favor coloque dos numeros,el primero tiene que ser menor al segundo: ");
            limiteInferior = scan.nextInt();
            scan.nextLine();
            limiteSuperior= scan.nextInt();
        }while(limiteInferior>limiteSuperior);
        
        List<String> lista= fizzBuzzFuncion(limiteInferior, limiteSuperior);
        System.out.println(lista); 
    }
    public static ArrayList<String> fizzBuzzFuncion(int limiteInferior,int limiteSuperior){
        ArrayList<String>palabra =new ArrayList<String>();
        for(int i=limiteInferior; i<limiteSuperior;i++){
            if (i%2==0 && i%3==0){
                palabra.add("Fizz Buzz");
            }
            else if (i%2==0){
                palabra.add("Fizz");
            }
            else if(i%3==0){
                palabra.add("Buzz");
            }
            else{
                String palabra1= String.valueOf(i);
                palabra.add(palabra1);
            }
        }
        return palabra;
    }
}
