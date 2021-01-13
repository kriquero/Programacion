public class ejercicio74 {

    public static void main(String args[]){

        Articulo carta = new Articulo();

        carta.nombre = "Liliana of the veil";
        carta.precio = 36.0F;       //43.76
        carta.cuantosQuedan = 7;
        carta.pvp = (carta.precio + (carta.precio*carta.IVA/100));

        System.out.println (carta.nombre + " - Precio:" + carta.precio + " - IVA:" + carta.IVA + "% - PVP:" + carta.pvp);

        carta.precio = 43.76F;
        carta.pvp = (carta.precio + (carta.precio*carta.IVA/100));

        System.out.println (carta.nombre + " - Precio:" + carta.precio + " - IVA:" + carta.IVA + "% - PVP:" + carta.pvp);

    }
    
}
