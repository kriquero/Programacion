import java.util.Scanner;

public class ejercicio72 {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        persona p1 = new persona();
        persona p2 = new persona();

        System.out.println ("Escriba el nombre de la persona 1");
        p1.nombre = sc.next();
        System.out.println ("Escriba los apellidos de la persona 1");
        p1.apellido = sc.next();
        System.out.println ("Escriba el DNI de la persona 1");
        p1.DNI = sc.next();
        System.out.println ("Escriba la edad de la persona 1");
        p1.edad = sc.nextInt();
        System.out.println ("Escriba el nombre de la persona 2");
        p2.nombre = sc.next();
        System.out.println ("Escriba los apellidos de la persona2");
        p2.apellido = sc.next();
        System.out.println ("Escriba el DNI de la persona 2");
        p2.DNI = sc.next();
        System.out.println ("Escriba la edad de la persona 2");
        p2.edad = sc.nextInt();

        String mayoria1 = (p1.edad<18)? "es menor de edad":"es mayor de edad";
        String mayoria2 = (p2.edad<18)? "es menor de edad":"es mayor de edad";

        System.out.println(p1.nombre + " " + p1.apellido + " con DNI " + p1.DNI + " " + mayoria1);
        System.out.println(p2.nombre + " " + p2.apellido + " con DNI " + p2.DNI + " " + mayoria2);

    }
    
}
