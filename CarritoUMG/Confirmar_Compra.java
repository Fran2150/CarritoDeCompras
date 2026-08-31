public class Confirmar_Compra
{
    public Producto listP;
    public int cantC;
    
    public Confirmar_Compra(Producto listP, int cantC){
        this.listP = listP;
        this.cantC = cantC;
    }
    public double cantFinal(){
        if(listP == null){
            return 0.0;
        }
        return listP.precio * cantC;
    }
    public void mostrarcompra(){
        double Subtotal = cantFinal();
        System.out.println(listP + " " + Subtotal);
    }
}   