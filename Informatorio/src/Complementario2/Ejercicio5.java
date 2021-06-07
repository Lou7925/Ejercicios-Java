package Complementario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        List <Integer> horas= new ArrayList<Integer>();
        int sueldo=0;
        System.out.println("Por favor coloque las horas trabajadas durante la semana: ");
        Scanner scan= new Scanner(System.in);
        for (int i =1; i<=5; i++){ 
            int hora=scan.nextInt();
            horas.add(hora);
        }

        List <Integer> pagos= new ArrayList<Integer>();
        System.out.println("Por favor coloque el pago por las horas trabajadas durante la semana: ");
        for(int i=1; i<=5; i++){ 
            int pago=scan.nextInt();
            pagos.add(pago);
        }

        List <Integer> semanal=new ArrayList<Integer>();
        for (int i=0; i<5; i++){
            int total=horas.get(i)*pagos.get(i);
            semanal.add(total);
            sueldo=total+sueldo;
        }
        System.out.println(semanal);
        System.out.println("Total Final: $"+sueldo);
    }
    
}
