import java.util.Scanner;

public class ejercicio72c{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        persona p1 = new persona("a" ,"b" ,"c", 15);
        persona p2 = new persona("a", "b", "c", 18);        

        String mayoria1 = (p1.edad<18)? "es menor de edad":"es mayor de edad";
        String mayoria2 = (p2.edad<18)? "es menor de edad":"es mayor de edad";

        System.out.println(p1.nombre + " " + p1.apellido + " con DNI " + p1.DNI + " " + mayoria1);
        System.out.println(p2.nombre + " " + p2.apellido + " con DNI " + p2.DNI + " " + mayoria2);

    }
    
}
