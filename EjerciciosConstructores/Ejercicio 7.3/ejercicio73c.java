public class ejercicio73c {

    public static void main(String args[]){

        rectangulo rec1 = new rectangulo(0,0,5,5);
        rectangulo rec2 = new rectangulo(7,9,2,3);

        for (int i = 0; i<2; i++){

          
            System.out.println("Las coordenadas del primer punto del rectangulo 1 son: (" + rec1.x1 + "," + rec1.y1 + ")");
            System.out.println("Las coordenadas del segundo punto del rectangulo 1 son: (" + rec1.x2 + "," + rec1.y2 + ")");
            System.out.println("Las coordenadas del primer punto del rectangulo 2 son: (" + rec2.x1 + "," + rec2.y1 + ")");
            System.out.println("Las coordenadas del segundo punto del rectangulo 2 son: (" + rec2.x2 + "," + rec2.y2 + ")");
            System.out.println("El perimetro del rectangulo 1 es " + rec1.peri + " u");
            System.out.println("El perimetro del rectangulo 2 es " + rec2.peri + " u");
            System.out.println("El area del rectangulo 1 es " + rec1.area + " u²");
            System.out.println("El area del rectangulo 2 es " + rec2.area + " u²");
        
            if(i<1){

                rec1.x1 = rec1.x1 + 2;
                rec1.y1 = rec1.y1 + 5;
                rec1.x2 = rec1.x2 / 5;
                rec1.y2 = rec1.y2 * 2;
        
                rec2.x1 = rec2.x1 - 4;
                rec2.y1 = rec2.y1 - 5;
                rec2.x2 = rec2.x2 * 4;
                rec2.y2 = rec2.y2 * 3;

            }

        }

    }
    
}
