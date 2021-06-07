package Complementario1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Por favor escriba su nombre y apellido: ");
        String Nombre= scan.nextLine();
        System.out.println("Por favor indique su edad: ");
        int Edad=scan.nextInt();
        scan.nextLine();
        System.out.println("Por favor escriba su direccion: ");
        String Direccion=scan.nextLine();
        System.out.println("Por favor indique su Ciudad: ");
        String Ciudad=scan.nextLine();
        System.out.println(Ciudad+","+Direccion+","+Edad+","+Nombre);
        scan.close();
    }
}
