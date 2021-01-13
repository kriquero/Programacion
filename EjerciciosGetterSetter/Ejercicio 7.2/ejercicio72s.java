import java.util.Scanner;

public class ejercicio72s{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        persona p1 = new persona("a" ,"b" ,"c", 15);
        persona p2 = new persona("a", "b", "c", 18);   
        
        System.out.println("podria usted, persona1, repetir el nombre");

        p1.setNombre(sc.nextLine());

        System.out.println("podria usted, persona1, repetir el apellido");

        p1.setApellido(sc.nextLine());

        System.out.println("podria usted, persona1, repetir el DNI");

        p1.setDNI(sc.nextLine());

        System.out.println("podria usted, persona1, repetir la edad");

        p1.setEdad(sc.nextInt());
        sc.nextLine();

        System.out.println("podria usted, persona2, repetir el nombre");

        p1.setNombre(sc.nextLine());

        System.out.println("podria usted, persona2, repetir el apellido");

        p1.setApellido(sc.nextLine());

        System.out.println("podria usted, persona2, repetir el DNI");

        p1.setDNI(sc.nextLine());

        System.out.println("podria usted, persona2, repetir la edad");

        p1.setEdad(sc.nextInt());
        sc.nextLine();

        

        String mayoria1 = (p1.getEdad()<18)? "es menor de edad":"es mayor de edad";
        String mayoria2 = (p2.getEdad()<18)? "es menor de edad":"es mayor de edad";

        System.out.println(p2.getNombre() + " " + p2.getApellido() + " con DNI " + p2.getDNI() + " " + mayoria2);
        System.out.println(p1.getNombre() + " " + p1.getApellido() + " con DNI " + p1.getDNI() + " " + mayoria1);

    }
    
}
