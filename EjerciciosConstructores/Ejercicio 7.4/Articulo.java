import java.math.RoundingMode;

public class Articulo {

    String nombre;
    double precio;
    int iva = 21;
    int cuantosQuedan;
    double pvp;


    public Articulo(String nombre, double precio, int iva, int cuantosQuedan){

        /*Tabién haría una comprobación de si el nombre tiene palabras prohibidas,
        pero no sabría como hacerlo. De la misma manera, los ejemplos son cartas de Magic,
        podría también compobar que el nombre esté en una base de datos de Magic, como Scryfall*/

        if(precio<0){

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
        if(iva!=21){

            System.out.println("Ni somos MediaMarkt (aunque tampoco tontos) ni somos de fuera de España, el iva está al 21%----------iva!=0");
            iva = 21;
        }
        if(cuantosQuedan<0){

            System.out.println("Podrémos estar sin stock pero en deuda, jamás--------------------------------------------------------cauntosQuedan<0");
            cuantosQuedan = 0;
        }

        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
        this.pvp = (precio+(precio*21/100));

    }

}
