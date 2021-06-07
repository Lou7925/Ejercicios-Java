package Complementario2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in );
        Empleado empleado1=new Empleado();
        System.out.println("Por favor coloque nombre y apellido: ");
        empleado1.setNombre(scan.nextLine());
        System.out.println("Por favor coloque dni: ");
        empleado1.setDni(scan.nextInt());
        scan.nextLine();
        System.out.println("Por favor coloque las horas trabajadas: ");
        empleado1.setHorasTrabajadas(scan.nextInt());
        scan.nextLine();
        System.out.println("Por favor coloque el precio por hora trabajada: ");
        empleado1.setValorPorHora(scan.nextInt());

        HashSet <Empleado>empleados = new HashSet<Empleado>();
        empleados.add(empleado1);
        HashMap<Integer,Integer> total = new HashMap<Integer,Integer>();
        total.put(empleado1.getDni(),empleado1.getValorPorHora()*empleado1.getHorasTrabajadas());
        System.out.println("El sueldo para el dni "+ empleado1.getDni()+" es "+total.get(empleado1.getDni()));

    }
    public static class Empleado{
        private String nombre;
        private int dni;
        private int horasTrabajadas;
        private int valorPorHora;
        
        public Empleado(){ 
            nombre="";
            dni=0;
            horasTrabajadas=0;
            valorPorHora=0;
        }
        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombreParaPoner){
            nombre= nombreParaPoner;
        }

        public int getDni(){
            return dni;
        }

        public void setDni(int dniParaPoner){
            dni= dniParaPoner;
        }

        public int getHorasTrabajadas(){
            return horasTrabajadas;
        }

        public void setHorasTrabajadas(int horasTrabajadasParaPoner){
            horasTrabajadas= horasTrabajadasParaPoner;
        }

        public int getValorPorHora(){
            return valorPorHora;
        }

        public void setValorPorHora(int valorPorHoraParaPoner){
            valorPorHora= valorPorHoraParaPoner;
        }
    }
}

