import java.util.Scanner;

public class persona{

    String DNI;
    String nombre;
    String apellido;
    int edad;
    
    Scanner sc = new Scanner(System.in);

    public persona(String nombre, String apellido, String DNI, int edad){

        System.out.println ("Escriba el nombre de la persona 1");
        this.nombre = sc.nextLine();
        System.out.println ("Escriba los apellidos de la persona 1");
        this.apellido = sc.nextLine();
        System.out.println ("Escriba el DNI de la persona 1");
        this.DNI = sc.nextLine();
        System.out.println ("Escriba la edad de la persona 1");
        this.edad = sc.nextInt();
       
    }
}
