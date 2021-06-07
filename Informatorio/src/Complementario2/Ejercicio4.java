package Complementario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos= new ArrayList<String>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Por favor ingrese los nombres: ");
        for (int i=1; i<=12; i++){ 
            String al= scan.nextLine();
            alumnos.add(al);
        }
        System.out.println(alumnos);
       
        List<String> curso1= alumnos.subList(0, 4);
        List<String> curso2= alumnos.subList(4, 8);
        List<String> curso3= alumnos.subList(8, 12);
        System.out.println("Los cursos se debividen en 3 grupos ,el primer grupo: "+curso1);
        System.out.println("Los cursos se debividen en 3 grupos ,el segundo grupo: "+curso2);
        System.out.println("Los cursos se debividen en 3 grupos ,el tercer grupo: "+curso3);

    } 
    
}
