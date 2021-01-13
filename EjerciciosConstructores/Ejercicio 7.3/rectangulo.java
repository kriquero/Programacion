public class rectangulo {

    int x1;
    int y1;
    int x2;
    int y2;
    int base;
    int altura;
    int peri;
    int area;
    

    public rectangulo(int x1,int y1,int x2,int y2){

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        if(x1>x2){

            System.out.println("ERROR al instanciar el rectangulo, intentaremos areglarlo");

        }
        if(y1>y2){
            System.out.println("ERROR al instanciar el rectangulo, intentaremos areglarlo");
        }
        
        this.base = x1-x2;
        base = (base<0)? base*-1:base;
        this.altura = y1-y2;
        altura = (altura<0)? altura*-1:altura;
        this.peri = altura*2 + base*2;
        this.area = altura * base;


    }
}
