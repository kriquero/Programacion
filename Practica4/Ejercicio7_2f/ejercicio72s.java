import java.util.Scanner;

public class ejercicio72s{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        persona p1 = new persona("a" ,"b" ,"c", 15);
        persona p2 = new persona("a", "b", "c", 18);   
        
        System.out.println("Por favor, la primea pesona que escriba el nombre");

        p1.setNombre(sc.nextLine());

        System.out.println("Por favor, la primea pesona que escriba el apellido");

        p1.setApellido(sc.nextLine());

        System.out.println("Por favor, la primea pesona que escriba el DNI");

        p1.setDNI(sc.nextLine());

        System.out.println("Por favor, la primea pesona que escriba la edad");

        p1.setEdad(sc.nextInt());
        sc.nextLine();

        System.out.println("Por favor, la segunda pesona que escriba el nombre");

        p2.setNombre(sc.nextLine());

        System.out.println("Por favor, la segunda pesona que escriba el apellido");

        p2.setApellido(sc.nextLine());

        System.out.println("Por favor, la segunda pesona que escriba el DNI");

        p2.setDNI(sc.nextLine());

        System.out.println("Por favor, la segunda pesona que escriba la edad");

        p2.setEdad(sc.nextInt());
        sc.nextLine();

        sc.close();

        p1.imprime();
        p2.imprime();

        if(p1.esMayorEdad()){
            System.out.println(p1.getNombre() + " es mayor de edad");
            if(p1.esJubilado()){
                System.out.println("No solo eso, sino que también es jubilado");
            }
        }
        if(p2.esMayorEdad()){
            System.out.println(p2.getNombre() + " es mayor de edad");
            if(p2.esJubilado()){
                System.out.println("No solo eso, sino que también es jubilado");
            }
        }
        System.out.println("Y la diferencia de edad existente entre estas dos personas es de: " + p1.diferenciaEdad(p2));
    }
    
}
