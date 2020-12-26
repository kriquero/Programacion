public class ejercicio71s {
    

    public static void main (String args[]){

        Punto punto1 = new Punto(4,0);
        Punto punto2 = new Punto(5,1);

        
        punto1.imprime();

        punto2.imprime();

        double dist = punto1.distancia(punto2);

        System.out.println("Y la distancia entre estos es: " + dist);

        punto1.setXY(7, -3);
        punto2.desplaza(14, -8);
        
        punto1.imprime();

        punto2.imprime();

        dist = punto1.distancia(punto2);

        System.out.println("Y la distancia entre estos es: " + dist);
    }
}
