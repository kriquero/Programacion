import java.util.Set;

public class rectangulo {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int base;
    private int altura;
    private int peri;
    private int area;
    

    public rectangulo(int x1,int y1,int x2,int y2){

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        cal();
    }
            
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public void setY2(int y2) {
        this.y2 = y2;
        cal();
    }
    public void cal(){
        setAltura(this.y2-this.y1);
        setBase(this.x2-this.x1);
        setPeri((this.base*2)+(2*this.altura));
        setArea(this.base*this.altura);
    }
    public void setBase(int base) {
        if(base<0){
            System.out.println("x1 está a la derecha de x2");
            base = -base;
        }
        this.base = base;
    }
    public void setAltura(int altura) {
        if(altura<0){
            System.out.println("y1 está debajo de y2");
            altura = -altura;
        }
        this.altura = altura;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public void setPeri(int peri) {
        this.peri = peri;
    }
    

    


    public int getAltura() {
        return altura;
    }
    public int getArea() {
        return area;
    }
    public int getBase() {
        return base;
    }
    public int getPeri() {
        return peri;
    }
    public int getX1() {
        return x1;
    }
    public int getX2() {
        return x2;
    }
    public int getY1() {
        return y1;
    }
    public int getY2() {
        return y2;
    }
    
   
    

    
}
