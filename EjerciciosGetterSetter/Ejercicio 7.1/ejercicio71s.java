public class ejercicio71s {
    

    public static void main (String args[]){

        Punto punto1 = new Punto(5,0);
        Punto punto2 = new Punto(10,10);
        Punto punto3 = new Punto(-3,7);

        System.out.println("La x del punto 1 es:" + punto1.getX());
        System.out.println("La y del punto 1 es:" + punto1.getY());

        System.out.println("La x del punto 2 es:" + punto2.getX());
        System.out.println("La y del punto 2 es:" + punto2.getY());

        System.out.println("La x del punto 3 es:" + punto3.getX());
        System.out.println("La y del punto 3 es:" + punto3.getY());

        punto1.setX(10);
        punto1.setY(8);
        punto2.setX(12);
        punto2.setY(4);
        punto3.setX(-4);
        punto3.setY(50);

        System.out.println("La x del punto 1 es:" + punto1.getX());
        System.out.println("La y del punto 1 es:" + punto1.getY());

        System.out.println("La x del punto 2 es:" + punto2.getX());
        System.out.println("La y del punto 2 es:" + punto2.getY());

        System.out.println("La x del punto 3 es:" + punto3.getX());
        System.out.println("La y del punto 3 es:" + punto3.getY());


    }
}
