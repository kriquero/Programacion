public class ejercicio74s {

    public static void main(String args[]){
        double desc = 80;
        Articulo art1 = new Articulo("Liliana of the veil", 36, 21, 8);
        

        art1.imprimir();
        art1.almacenar(12);
        art1.imprimir();
        art1.vender(40);
        art1.imprimir();
        art1.getPvpDescuento(desc);
        art1.imprimir();

        


    }
    
}
