import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Ejercicio5 {
    public static void main(String[] args) throws IOException, ParseException {
        String path= "C:/Users/lourd/OneDrive/Escritorio/Ejercicios Java/Empleado.txt";
        BufferedReader br=new BufferedReader(new FileReader(path));
        String line=br.readLine();
        List <Empleado> listaEmpleado= new ArrayList<Empleado>();
        

        while(line != null){
            String[] parts = line.split(",");
            String nombre=parts[0];
            String apellido=parts[1];
            LocalDate fecha=convertidorDeFecha(parts[2]);
            float sueldo=convertidorDeNumeros(parts[3]);
            Empleado empleado1=new Empleado();
            empleado1.setNombre(nombre);
            empleado1.setApellido(apellido);
            empleado1.setFecha(fecha);
            empleado1.setSueldo(sueldo);
            listaEmpleado.add(empleado1);
            line=br.readLine();
        }
        br.close();
        obtenerEdadDeLosEmpleados(listaEmpleado);
        sueldoMaximoYMinimo(listaEmpleado);
        
    }
    public static class Empleado{
        private String nombre;
        private String apellido;
        private LocalDate fecha;
        private float sueldo;

        public String getNombre(){
            return nombre;
        }  
        public String getApellido(){
            return apellido;
        }
        public LocalDate getFecha(){
            return fecha;
        }
        public float getSueldo(){
            return sueldo;
        }
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public void setApellido(String apellido){
            this.apellido=apellido;
        }
        public void setFecha(LocalDate fecha){
            this.fecha=fecha;
        }
        public void setSueldo(float sueldo){
            this.sueldo=sueldo;
        }
    }
    public static LocalDate convertidorDeFecha(String fecha) throws ParseException{  
        LocalDate date1=LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return date1;
    }
    public static float convertidorDeNumeros(String sueldo){
        float num=Float.parseFloat(sueldo);
        return num;
    }
    public static void letraDada(List<Empleado> listaDeEmpleados){
        Scanner scan= new Scanner(System.in);
        System.out.println("Por favor coloque una letra: ");
        String letra= scan.nextLine();
        char l=letra.charAt(0);
        for (int i=0; i <listaDeEmpleados.size();i++){
            String apellido=listaDeEmpleados.get(i).getApellido();
            char a=apellido.charAt(0);
            if (a==l){
                System.out.println(apellido);
            }
        }
    }
    public static int calcularEdad(LocalDate fecha){
        LocalDate fechaDeHoy =LocalDate.now(); 
        Period diferencia = Period.between(fecha, fechaDeHoy);
        int edad= diferencia.getYears();
        return edad;
    }
    public static void obtenerEdadDeLosEmpleados(List<Empleado>listaDeEmpleados){
        String nombreDelMasJoven=listaDeEmpleados.get(0).getNombre();
        int edadDelMasJoven=calcularEdad(listaDeEmpleados.get(0).getFecha());
        String nombreDelMasViejo=listaDeEmpleados.get(0).getNombre();
        int edadDelMasViejo=calcularEdad(listaDeEmpleados.get(0).getFecha());

        for (int i=0; i <listaDeEmpleados.size();i++){
            int edad=calcularEdad(listaDeEmpleados.get(i).getFecha());
            if (edadDelMasJoven >edad){
                edadDelMasJoven=edad;
                nombreDelMasJoven=listaDeEmpleados.get(i).getNombre();
            }
            else if (edadDelMasViejo<edad){
                edadDelMasViejo=edad;
                nombreDelMasViejo=listaDeEmpleados.get(i).getNombre();
            }
        }
        System.out.println("El empleado mas joven es: "+ nombreDelMasJoven+ " porque tiene "
        + edadDelMasJoven +" años");
        System.out.println("El empleado mas viejo es: "+nombreDelMasViejo+ " porque tiene "
        +edadDelMasViejo+" años");
    }
        public static void sueldoMaximoYMinimo(List<Empleado>listaDeEmpleados){
        float sueldoMaximo=listaDeEmpleados.get(0).getSueldo();
        String nombreSueldoMaximo=listaDeEmpleados.get(0).getNombre();
        float sueldoMinimo=listaDeEmpleados.get(0).getSueldo();
        String nombreSueldoMinimo=listaDeEmpleados.get(0).getNombre();
        for(int i=0; i<listaDeEmpleados.size();i++){
            float sueldoComparado=listaDeEmpleados.get(i).getSueldo();
            if (sueldoMaximo<sueldoComparado){
                sueldoMaximo=sueldoComparado;
                nombreSueldoMaximo=listaDeEmpleados.get(i).getNombre();
            }
            else if (sueldoMinimo>sueldoComparado){
                sueldoMinimo=sueldoComparado;
                nombreSueldoMinimo=listaDeEmpleados.get(i).getNombre();
            }
        }
        System.out.println("El empleado que mas gana es: "+ nombreSueldoMaximo+ " porque gana $"
        + sueldoMaximo );
        System.out.println("El empleado que menos gana es: "+nombreSueldoMinimo+ " porque gana $"
        +sueldoMinimo);
    }
     
 
}
