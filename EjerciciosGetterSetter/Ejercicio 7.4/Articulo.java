import java.math.RoundingMode;
import java.util.Set;


public class Articulo {

    private String nombre;
    private double precio;
    private int iva = 21;
    private int cuantosQuedan;
    private double pvp;


    public Articulo(String nombre, double precio, int iva, int cuantosQuedan){
        setCuantosQuedan(cuantosQuedan);
        setIva(iva);
        setNombre(nombre);
        setPrecio(precio);
        setPvp(pvp);
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
        this.pvp = (precio+(precio*21/100));
        
    }



    public void setCuantosQuedan(int cuantosQuedan) {
       
        if(cuantosQuedan<0){

            System.out.println("Podrémos estar sin stock pero en deuda, jamás--------------------------------------------------------cauntosQuedan<0");
            cuantosQuedan = 0;
        }
        this.cuantosQuedan = cuantosQuedan;
    }
    public void setIva(int iva) 
   
    {if(iva!=21){

        System.out.println("Ni somos MediaMarkt (aunque tampoco tontos) ni somos de fuera de España, el iva está al 21%----------iva!=0");
        iva = 21;
    }
        this.iva = iva;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) 
    
    { if(precio<0){

        System.out.println("Creo que te has equivocado. Has intentado insertar un número negativo, vamos a darle la vuelta--------precio<0");
        precio = -1*precio;
        System.out.println("Mejor así" + precio);
    }
        double holi = ((precio*100)-(int)(precio*100));

    if(holi != 0){

        System.out.println("Demasiados decimales, aquí no tratamos los milicentimos-----------------------------------------------si hay decimales mas chiquitos que 0'01");

        int esto = (int)(precio*100);
        precio = esto;
        precio = precio/100;
    }
        this.precio = precio;
    }
    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }
    public int getIva() {
        return iva;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public double getPvp() {
        return pvp;
    }
    

}
