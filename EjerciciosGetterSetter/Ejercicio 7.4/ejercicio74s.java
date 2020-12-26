public class ejercicio74s {

    public static void main(String args[]){

        Articulo art1 = new Articulo("Liliana of the veil", 36, 21, 8);
        

        System.out.println ("\n" + art1.getNombre() + " - Precio:" + art1.getPrecio() + " - IVA:" + art1.getIva() + "% - PVP:" + art1.getPvp() + "\n\n");

        System.out.println ("-------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println ("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println ("y vamos a ver alguno que esté todo mal");
        Articulo art2 = new Articulo("Spelleater Wolverine", -0.021, 1, -800);
        System.out.println (art2.getNombre() + " - Precio:" + art2.getPrecio() + " - IVA:" + art2.getIva() + "% - PVP:" + art2.getPvp());

        


    }
    
}
