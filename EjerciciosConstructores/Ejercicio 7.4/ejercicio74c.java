public class ejercicio74c {

    public static void main(String args[]){

        Articulo carta1 = new Articulo("Liliana of the veil", 36, 21, 8);
        

        System.out.println ("\n" + carta1.nombre + " - Precio:" + carta1.precio + " - IVA:" + carta1.iva + "% - PVP:" + carta1.pvp + "\n\n");

        System.out.println ("-------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println ("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println ("y vamos a ver alguno que esté todo mal");
        Articulo carta2 = new Articulo("Spelleater Wolverine", -0.021, 1, -800);
        System.out.println (carta2.nombre + " - Precio:" + carta2.precio + " - IVA:" + carta2.iva + "% - PVP:" + carta2.pvp);

        


    }
    
}
