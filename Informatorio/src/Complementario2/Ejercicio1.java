package Complementario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<String>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Por favor coloque 3 ciudades: ");
        String ciudadUno=scan.next();
        String ciudadDos=scan.next();
        String ciudadTres=scan.next();
        ciudades.add(ciudadUno);
        ciudades.add(ciudadDos);
        ciudades.add(ciudadTres);
        System.out.println("Las ciudades elegidas son:");
        System.out.println("#1 "+ ciudades.get(0));
        System.out.println("#2 "+ ciudades.get(1));
        System.out.println("#3 "+ ciudades.get(2));

    }
}*/

public class Ejercicio1{
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<String>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Cuantas ciudades desea agregar?: ");
        int num=scan.nextInt();
        scan.nextLine();
        for (int i=1; i <=num; i++){
            System.out.println("Por favor coloque las ciudad: ");
            ciudades.add(scan.nextLine());
        }
        for (int i=0; i <num;i++){
            System.out.println("#"+(i+1)+" "+ciudades.get(i));
        }
    }
}
