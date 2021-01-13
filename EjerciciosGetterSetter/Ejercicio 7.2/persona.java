import java.util.Scanner;

public class persona{

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    
    Scanner sc = new Scanner(System.in);

    public persona(String nombre, String apellido, String dni, int edad){

        System.out.println ("Escriba el nombre de la persona");
        this.nombre = sc.nextLine();
        System.out.println ("Escriba los apellidos de la persona");
        this.apellido = sc.nextLine();
        System.out.println ("Escriba el DNI de la persona");
        this.dni = sc.nextLine();
        System.out.println ("Escriba la edad de la persona");
        this.edad = sc.nextInt();
       
    }

    public String getApellido() {
        return apellido;
    }
    public String getDNI() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDNI(String dni) {
        this.dni = dni;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }








}
