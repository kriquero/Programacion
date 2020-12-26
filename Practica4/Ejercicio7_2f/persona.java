import java.util.Scanner;

public class persona{

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    

    public persona(String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
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
    public void imprime(){
        System.out.println(this.nombre + " " + this.apellido + " con DNI " + this.dni + " tiene " + this.edad + "años");
    }
    public boolean esMayorEdad(){
        if(this.edad<18){
            return false;
        }else{return true;}
    }
    public boolean esJubilado(){
        if(this.edad<65){
            return false;
        }else{return true;}
    }
    public int diferenciaEdad(persona p){
        return (Math.abs(this.edad - p.edad));
    }







}
