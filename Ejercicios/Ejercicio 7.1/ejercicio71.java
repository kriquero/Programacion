public class ejercicio71 {
    

    public static void main (String args[]){

        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        Punto punto3 = new Punto();

        punto1.x = 5;
        punto1.y = 0;

        punto2.x = 10;
        punto2.y = 10;

        punto3.x = -3;
        punto3.y = 7;

        System.out.println("La x del punto 1 es:" + punto1.x);
        System.out.println("La y del punto 1 es:" + punto1.y);

        System.out.println("La x del punto 2 es:" + punto2.x);
        System.out.println("La y del punto 2 es:" + punto2.y);

        System.out.println("La x del punto 3 es:" + punto3.x);
        System.out.println("La y del punto 3 es:" + punto3.y);

        punto1.x = punto1.x + 3;    //sumo 3
        punto1.y = punto1.y * 3;    //multiplico por 3
        punto2.x = punto2.x - 5;    //resto 5
        punto2.y = punto2.y * 3;    //multiplico por 3
        punto3.x = punto3.x / 3;    //divido entre 3
        punto3.y = punto3.y - 2;    //resto 2

        System.out.println("La x del punto 1 es:" + punto1.x);
        System.out.println("La y del punto 1 es:" + punto1.y);

        System.out.println("La x del punto 2 es:" + punto2.x);
        System.out.println("La y del punto 2 es:" + punto2.y);

        System.out.println("La x del punto 3 es:" + punto3.x);
        System.out.println("La y del punto 3 es:" + punto3.y);


    }
}
