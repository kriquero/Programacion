public class ejercicio73s {

    public static void main(String args[]){

        rectangulo rec1 = new rectangulo(0,0,5,5);
        rectangulo rec2 = new rectangulo(7,9,2,3);

        
                
          
                System.out.println("Las coordenadas del primer punto del rectangulo 1 son: (" + rec1.getX1() + "," + rec1.getY1() + ")");
                System.out.println("Las coordenadas del segundo punto del rectangulo 1 son: (" + rec1.getX2() + "," + rec1.getY2() + ")");
                System.out.println("Las coordenadas del primer punto del rectangulo 2 son: (" + rec2.getX1() + "," + rec2.getY1() + ")");
                System.out.println("Las coordenadas del segundo punto del rectangulo 2 son: (" + rec2.getX2() + "," + rec2.getY2() + ")");
                System.out.println("El perimetro del rectangulo 1 es " + rec1.getPeri() + " u");
                System.out.println("El perimetro del rectangulo 2 es " + rec2.getPeri() + " u");
                System.out.println("El area del rectangulo 1 es " + rec1.getArea() + " u²");
                System.out.println("El area del rectangulo 2 es " + rec2.getArea() + " u²");
            
           

                rec1.setX1 ((rec1.getX1() + 2));
                rec1.setY1 ((rec1.getY1() + 5));
                rec1.setX2 ((rec1.getX2() / 5));
                rec1.setY2 ((rec1.getY2() * 2));
                rec2.setX1 ((rec2.getX1() - 4));
                rec2.setY1 ((rec2.getY1() - 2));
                rec2.setX2 ((rec2.getX2() * 4));
                rec2.setY2 ((rec2.getY2() * -3));



                System.out.println("Las coordenadas del primer punto del rectangulo 1 son: (" + rec1.getX1() + "," + rec1.getY1() + ")");
                System.out.println("Las coordenadas del segundo punto del rectangulo 1 son: (" + rec1.getX2() + "," + rec1.getY2() + ")");
                System.out.println("Las coordenadas del primer punto del rectangulo 2 son: (" + rec2.getX1() + "," + rec2.getY1() + ")");
                System.out.println("Las coordenadas del segundo punto del rectangulo 2 son: (" + rec2.getX2() + "," + rec2.getY2() + ")");
                System.out.println("El perimetro del rectangulo 1 es " + rec1.getPeri() + " u");
                System.out.println("El perimetro del rectangulo 2 es " + rec2.getPeri() + " u");
                System.out.println("El area del rectangulo 1 es " + rec1.getArea() + " u²");
                System.out.println("El area del rectangulo 2 es " + rec2.getArea() + " u²");
            
            

            

        

    }
    
}
