public class Punto {

    private int x;
    private int y;

    public Punto(){

    }

    public Punto (int x, int y){

        this.x = x;
        this.y = y;

    }
        
    public void imprime(){
        System.out.println("(" + this.x + ", " + this.y + ")");

    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;

    }

    public void desplaza(int dx, int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public double distancia(Punto p){
        double d = 0;
        d = Math.sqrt(Math.pow((p.getx() - this.x),2) + Math.pow((p.gety() - this.y), 2));
        return d;
    }


}
