import java.math.RoundingMode;
import java.util.Set;


public class Articulo {

    private String nombre;
    private double precio;
    private int iva = 21;
    private int cuantosQuedan;
    private double pvp;


    public Articulo(String nombre, double precio, int iva, int cuantosQuedan){
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
        this.pvp = (precio+(precio*21/100));
        
    }
    public void getPvp() {

        this.pvp = (precio+(precio*21/100));
    }
    public void getPvpDescuento(double desc) {

        this.pvp = ((precio+(precio*21/100))*(desc/100));
    }

    public void imprimir(){
        
        System.out.println ("\n" + this.nombre + " - Precio:" + this.precio + " - IVA:" + this.iva + "% - PVP:" + this.pvp + "- Quedan: " + this.cuantosQuedan + "\n");
    }
    public boolean vender(int x){
        if(this.cuantosQuedan<x){
            return false;
        }else{
            this.cuantosQuedan = this.cuantosQuedan - x;
            return true;
        }
    }
    public boolean almacenar(int x){
        if((this.cuantosQuedan+x)>100){
            return false;
        }else{
            this.cuantosQuedan = this.cuantosQuedan + x;
            return true;
        }
    }


}
